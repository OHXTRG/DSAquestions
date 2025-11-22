# Notes

## Note 1

- Matrix is important
- remember matrix
  <!-- <pre> -->
  (row,col) = (x,y) simple matrix
  | # | col | col | col | col | col |
  |---|------|------|------|------|------|
  |row| (11) | (12) | (13) | (14) | (15) |
  |row| (21) | (22) | (23) | (24) | (25) |
  |row| (31) | (32) | (33) | (34) | (35) |
  |row| (41) | (42) | (43) | (44) | (45) |
  |row| (51) | (52) | (53) | (54) | (55) |

<!-- </pre> -->

- Matrix with sum of rows and cols
  | # | col | col | col | col | col |  
  |---|-----|-----|-----|-----|-----|  
  |row| (2) | (3) | (4) | (5) | (6) |
  |row| (3) | (4) | (5) | (6) | (7) |
  |row| (4) | (5) | (6) | (7) | (8) |
  |row| (5) | (6) | (7) | (8) | (9) |
  |row| (6) | (7) | (8) | (9) | (10)|

  | #   | col  | col  | col  | col  | col  |
  | --- | ---- | ---- | ---- | ---- | ---- |
  | row | (00) | (01) | (02) | (03) | (04) |
  | row | (10) | (11) | (12) | (13) | (14) |
  | row | (20) | (21) | (22) | (23) | (24) |
  | row | (30) | (31) | (32) | (33) | (34) |
  | row | (40) | (41) | (42) | (43) | (44) |

- Matrix with sum of rows and cols
  | # | col | col | col | col | col |  
  |---|-----|-----|-----|-----|-----|  
  |row| (1) | (2) | (3) | (4) | (5) |
  |row| (2) | (3) | (4) | (5) | (6) |
  |row| (3) | (4) | (5) | (6) | (7) |
  |row| (4) | (5) | (6) | (7) | (8) |
  |row| (5) | (6) | (7) | (8) | (9) |

- what is the pattern ?
- Every row starts at R-1 and ends at R+C

  - if include 0 then R and ends at R+C where ( R = row number ) , ( C = total cols)

### Inverted Rotated Half Pyramid

- what is the patten of Inverted Rotated Half Pyramid
- Matrix with sum of rows and cols
- Here The start is printed at places where the sum of r and c is >= n-1 if 0 or >= n

### Inverted Rotated Half Pyramid

- what is the patten of Inverted Rotated Half Pyramid
- Here The start is printed at places where the sum of r and c is <= n-1 if 0 or <= n

## Note

- use diagonal of matrix for nXn patterns
- for sum use diagonal top left to bottom right
- for this diagonal sum is same on diagnal points
- for inverted half pyramid and inverted half pyramid rotated
- target diagonal at i == j

## Note

- Matrix NXN start at 0 sums odd even
- First row or matrix always start with odd and then even
- the row no. is odd so start with odd > even
- row no. even start with even > odd

- Matrix with sum of rows and cols
  | # | col | col | col | col | col |  
  |---|-----|-----|-----|-----|-----|  
  |row| (0) | (1) | (0) | (1) | (0) |
  |row| (1) | (0) | (1) | (0) | (1) |
  |row| (0) | (1) | (0) | (1) | (0) |
  |row| (1) | (0) | (1) | (0) | (1) |
  |row| (0) | (1) | (0) | (1) | (0) |

## Note Even NXN matrix

| #   | col  | col  | col  | col  | col  | col  |
| --- | ---- | ---- | ---- | ---- | ---- | ---- |
| row | (00) | (01) | (02) | (03) | (04) | (05) |
| row | (10) | (11) | (12) | (13) | (14) | (15) |
| row | (20) | (21) | (22) | (23) | (24) | (25) |
| row | (30) | (31) | (32) | (33) | (34) | (35) |
| row | (40) | (41) | (42) | (43) | (44) | (45) |
| row | (50) | (51) | (52) | (53) | (54) | (55) |
