SITDHIBONG=sitdhibong-proposal

config:
	pip install pywatch

build: 
	# @bibtex $(SITDHIBONG)
	# xelatex -interaction=nonstopmode $(SITDHIBONG).tex
	xelatex -interaction=nonstopmode $(SITDHIBONG).tex

watch: *.tex *.bib
	@pywatch "make -B build" $?
