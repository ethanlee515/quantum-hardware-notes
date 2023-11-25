# My Questions about Quantum Hardware Readings

## Hardware design?

* verilog vs VHDL vs SystemVerilog?
* Bluespec and Kami
* Is high-level synthesis worth looking into?
* What is cocotb?
* OpenPulse and Qiskit Pulse vs. QICK and Qubic?

## Physics behind qubits?

* What is a pulse? Photons or wave? What is in a pulse? Frequency? Phase? Polarization?
* Is the term "pulse" overloaded for both waves and Hamiltonians...?
* How do you go from a gate to a pulse sequence (say, for CNOT)?
* What kinds of quantum computer are compatible with this pulse/wave picture? (Ion trap? Neutral ion? Superconductor?)
* How do these pulses relate to Hamiltonians? How does SimuQ fit into the picture?
* Given a computataion, pulse choices aren't unique, right? What's the "best" one then?
* SimuQ's AAIS: What is it?
* What are "decimated readouts" in QICK, and do I care?
* Readout... Are we sending a pulse here too? Why?
* Quantum optimal control...?
* What is the Ising model? Why do we care about locality?
* What is a transmon? And what is the anharmonicity of a transmon?
* How does "microwave" relate to "pulse"?
* What do I need to know about crosstalk?
* What is a carrier signal?
* frequency resonance between pulse and qubit: how? where?
* How would you (physically) set phase? Sounds like that requires *very* fine control...? You can't just hit it with a polarizer, can you?
* How precise does the timing have to be? Is synchronizing different qubits "easy"?
* Qiskit Pulse: What's the relationship between channels and qubits? (I.e. many-to-one or many-to-many?)
* Measurement proceed seems quite nontrivial - how much do I need to know?
* What is a "Drag" pulse (as defined in Qiskit) and is it useful? Why or why not?

## Ideas

* Verifying the entire stack seems too reckless or ambitious, right?
* Verified GRAPE worth doing?
* What is error-prone enough that it'll help to have verified?
