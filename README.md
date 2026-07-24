# FaweryChallenge

## Quantum Radar

Design a radar system that has the following:

- The radar handles info sent from the physical radar:
  - Plate number  Date, Car type (e.g., Private, Truck, Bus), Speed, Seatbelt status (fastened / not)
    
- A set of defined rules, like:
  - Truck speed shouldn’t exceed 60
  - Private car speed shouldn’t exceed 80
  - Seat belt should be fastened

- On each observation, you may generate zero or more violations according to the available rules.

- If there are violations, a fine should be issued that has information about the violations and the fees of each, printing exactly:
  - Traffic for car ABC1234
  - Total amount: 400 EGP
  - Violations:
    - Seatbelt not fastned : 100 EGP
    - speed of 94 exceeded max allowed 80 : 300 EGP

- Get all fines: plate number with total amount.
- Get all violated rules with count for each.

- The system should be designed to be extensible, allowing flexibility for adding rules without modifying the Radar.

## UML
<img width="788" height="360" alt="image" src="https://github.com/user-attachments/assets/3f347272-005b-43ef-9055-7732dfc7dbf8" />


## Example Code Running
<img width="821" height="467" alt="image" src="https://github.com/user-attachments/assets/f5c7ff23-ed93-40de-b8f8-6eff918a306e" />



