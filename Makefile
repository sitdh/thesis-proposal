SITDHIBONG=sitdhibong-proposal

config:
	pip install pywatch

reference:
	@bibtex $(SITDHIBONG)
	xelatex -interaction=nonstopmode $(SITDHIBONG).tex

build: 
	xelatex -interaction=nonstopmode $(SITDHIBONG).tex

watch: *.tex # *.bib
	@pywatch "make -B build" $?
