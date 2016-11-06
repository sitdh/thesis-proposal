SITDHIBONG=sitdhibong-proposal

config:
	pip install pywatch

reference:
	@bibtex $(SITDHIBONG)
	xelatex -interaction=nonstopmode $(SITDHIBONG).tex

# clean: 
# 	for i in `find . -name '*.aux'`; do if [[ -z "${i// }" ]]; then rm $i; done
# 	for i in `find . -name '*.log'`; do rm $i; done

build: 
	xelatex -interaction=nonstopmode $(SITDHIBONG).tex

watch: *.tex **/*.tex *.bib
	make build && make reference && make build
	@pywatch "make -B build" $?
