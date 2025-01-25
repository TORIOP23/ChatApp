#!/bin/bash

# Get the current directory name as the artifact ID
ARTIFACT_ID=$(basename "$PWD")

# Convert the artifact ID to PascalCase for the main class name
MAIN_CLASS=$(echo "$ARTIFACT_ID" | awk '{print toupper(substr($0,1,1)) tolower(substr($0,2))}')Application

# Group ID
GROUP_ID="com.chat"

# Base package directory
PACKAGE_DIR="src/main/java/com/chat/$ARTIFACT_ID"

# Create the directory structure
mkdir -p "$PACKAGE_DIR"
mkdir -p "src/main/resources"
mkdir -p "src/test/java/com/chat/$ARTIFACT_ID"
mkdir -p "src/test/resources"

# create the build.gradle.kts file
cat <<EOF > build.gradle.kts

# Create the main application class file
MAIN_CLASS_FILE="$PACKAGE_DIR/${MAIN_CLASS}.java"
cat <<EOF > "$MAIN_CLASS_FILE"
package com.chat.$ARTIFACT_ID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class $MAIN_CLASS {
    public static void main(String[] args) {
        SpringApplication.run($MAIN_CLASS.class, args);
    }
}
EOF

# Output success message
echo "Spring Boot project structure created successfully!"
echo "Main class: $MAIN_CLASS_FILE"
echo "Project structure:"
tree src