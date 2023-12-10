# Questions

## Physics Behind Qubits

* What is a pulse? Does wave-particle duality matter here, or is it always modelled as a wave (and not photons)?
* What is in a pulse? Frequency? Phase? Amplitude (envelope)? Polarization?
* How do you go from a gate to a pulse sequence (say, for CNOT)?
* Given a computataion, pulse choices aren't unique, right? What's the "best" one then?
* How do these pulses relate to Hamiltonians? How does SimuQ fit into the picture?
* Is the term "pulse" overloaded for both waves and Hamiltonians...?
* What is *AAIS* in SimuQ and how to use it? Should I learn it?
* Are all quantum computers compatible with this pulse/wave picture? (Ion trap? Neutral ion? Superconductor?)
* What are "decimated readouts" in QICK, and do I care?
* It seems like we're sending a pulse for readout too. What's the physics behind this?
* Measurement process seems quite nontrivial - how much do I need to know?
* What is quantum optimal control and is it relevant to what we're doing?
* How much should I know about the Ising model?
* What is a transmon? And what is the anharmonicity of a transmon?
* How does "microwave" relate to "pulse"?
* What do I need to know about crosstalk?
* What is a "carrier signal"?
* What is the "frequency resonance" between a pulse and a qubit?
* How would you *physically* set a phase? That's not just a photon polarizer, is it? Do I care, or should I treat it as black-box/"magic"?
* How precise does the timing have to be? Is synchronizing different qubits "easy"? Are relativistic effects considered here?
* Qiskit Pulse: What's the relationship between channels and qubits? (I.e. many-to-one or many-to-many?)
* What is a "Drag" pulse (as defined in Qiskit) and is it useful? Why or why not?
* What is the typical "native gate set" of a machine?
* How much should I know/care about T1/T2 decay errors?
* What is the cross resonance gate?
* What is error-prone enough that it'll help to have formally verified?
* What is GRAPE, and do we care?

## Hardware Design

* What's the difference between verilog vs VHDL vs SystemVerilog?
* Is Kami just verifiable Bluespec, or are there any differences I should be more "careful" about?
* Is high-level synthesis worth looking into?
* How to use cocotb, and do I care?
* Where do OpenPulse and Qiskit Pulse fit into the picture, comparing to QICK and Qubic?
