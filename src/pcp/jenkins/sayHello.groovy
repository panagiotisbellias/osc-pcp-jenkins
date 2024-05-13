package pcp.jenkins

#!/usr/bin/env groovy
def call(String name = 'human') {
    echo "Hello, ${name}."
}