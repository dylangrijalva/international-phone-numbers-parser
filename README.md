# Phone Number Parser & Validator

## Overview
This repository provides a function for parsing and validating phone numbers based on a given country code. It intelligently handles phone numbers in either:
- **National format** (with a corresponding country code)
- **E.164 format** (with the international dialing prefix `+`)

The function ensures that phone numbers are correctly formatted and validated using Google's [libphonenumber](https://github.com/google/libphonenumber) library.

## Features
✅ Parses phone numbers in various formats (national, international, E.164)  
✅ Validates phone numbers based on the provided country code  
✅ Returns phone numbers in standardized **E.164 format**  
✅ Handles incorrect or malformed inputs gracefully  
