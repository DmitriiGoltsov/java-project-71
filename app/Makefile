.DEFAULT_GOAL := build-run

NEST1=src/test/resources/fixtures/nested_file1.json
NEST2=src/test/resources/fixtures/nested_file2.json
NEST3=src/test/resources/fixtures/nested_file1.yml
NEST4=src/test/resources/fixtures/nested_file2.yml

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist-nest:
	./build/install/app/bin/app $(NEST1) $(NEST2)

run-dist-nest-yml:
	./build/install/app/bin/app $(NEST3) $(NEST4)

run-dist-plain:
	./build/install/app/bin/app -f plain $(NEST1) $(NEST2)

run-dist-json:
	./build/install/app/bin/app -f json $(NEST1) $(NEST2)

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain checkstyleTest

update-deps:
	./gradlew useLatestVersions


build-run: build run

.PHONY: build