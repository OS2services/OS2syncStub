#!/bin/bash
rm -Rf build/
mkdir build
cp -R ../../* build

docker build -t os2services:os2syncstub .

rm -Rf build/
