.PHONY: help
help: ## Prints help for all make commands
	@grep -E '^[a-zA-Z._-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

APP_NAME?=hello-world

clean:
	rm -rf ./out

ensure-build-dir:
	mkdir -p ./out

build-deps: ## Install dependencies
	go install
	go mod tidy

build:  clean ensure-build-dir compile zip ## Build the application for mac

compile: ## Compile for mac
	CGO_ENABLED=0 GOOS=darwin GOARCH=arm64 go build -o ./out/darwin-arm64/$(APP_NAME) ./main.go
	CGO_ENABLED=0 GOOS=linux GOARCH=amd64 go build -o ./out/linux-amd64/$(APP_NAME) ./main.go

zip: ## Zip the compiled artifacts
	zip -j ./out/$(APP_NAME)-darwin-amd64.zip ./out/darwin-arm64/$(APP_NAME)
	zip -j ./out/$(APP_NAME)-linux-amd64.zip ./out/linux-amd64/$(APP_NAME)
