.PHONY: help
help: ## Prints help for all make commands
	@grep -E '^[a-zA-Z._-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

APP_NAME?=hello-world



ensure-build-dir:
	mkdir -p out

build-deps: ## Install dependencies
	go install
	go mod tidy

build: ensure-build-dir compile ## Build the application for mac

compile: ## Compile for mac
	go build -o ./out/$(APP_NAME) ./main.go
	CGO_ENABLED=0 GOOS=linux GOARCH=amd64 go build -o ./out/$(APP_NAME)-linux-amd64 ./main.go