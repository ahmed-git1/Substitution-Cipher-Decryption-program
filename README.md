 Substitution Cipher Decryption Program – CS285 Project

Overview:

A small command‑line Java tool that brute‑forces every possible key of a Caesar‑style substitution cipher to recover readable text.
It parses an input file that can contain multiple paragraphs (separated by blank lines), decrypts each paragraph with all shifts in the custom alphabet
abcdefghijklmnopqrstuvwxyz1234567890,.- and writes the results to decrypted_<input‑name>.txt.

Features:

Reads any UTF‑8 .txt file supplied by the user.

Runs the decryption routine for every key (0 … alphabet‑length – 1).

Saves a tidy output file showing, for each paragraph, every decrypted candidate and the key that produced it.

Getting Started:

Prerequisites

**Java 8 or later** JDK on your PATH  
*(Tested with Java 8)*

Any terminal / command prompt.

Running:

Run "main" class

License:

Released under the MIT License — see LICENSE for details.
