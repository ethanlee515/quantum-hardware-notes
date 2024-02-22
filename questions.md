# Questions

## Physics Behind Qubits

* I am a bit confused by how to probe a cavity resonator. The literature I'm reading usually writes down some Hamiltonian including a "dispersive shift" term, and then immediately draws some nice figures of the reflected or transmitted frequency (i.e. Figure 5 [here](https://arxiv.org/abs/cond-mat/0402216) or Figure 19 [here](https://arxiv.org/abs/1904.06560)) without explaining (or citing) how those come from the Hamiltonian. Is there perhaps some quantum optics reference that would help me understand the picture here a bit better?
* In [these lecture notes](https://cs269q.stanford.edu/lectures/lecture11.pdf) (recommended to me by Junyi) I see a wave function written in terms of *both* flux and charge (as in, `psi(Phi, Q)`) on Equation 1.14. Now, I'm slowly learning my physics, but I can't see what's going on mathematically here. Is this suggesting that we can write a wave function in both (generalized) position and momentum? I looked around a bit and [it appears that](https://physics.stackexchange.com/a/632098) we can write the wave function in *either* position space (as in, `psi(x, t)`; what I see in textbooks) *or* momentum space (as in, `psi(p, t)`), but I'm not sure about *both* (so, I guess `psi(x, p)` or `psi(x, p, t)`?). Wouldn't this run into troubles with uncertainty principle and whatnot?
* Writing down the Hamiltonian involves perturbation theory and use of tools such as "rotating wave approximation" and "Schrieffer-Wolff transformation". Do I need to know the details or should I just take the resulting Hamiltonian and be happy with it? Does our simulator come in after those tools or not?
* How should we label our basis for the simulator - Fock/computational or wave functions?
* Where do coherent states fit into the picture?
* What is Rabi oscillation?
* What is the lamb shift? Is it related to AC Stark shift?
* What is Lindblad's equation?
* What is the "number" operator `a^\dag a`? How to use it, and where does it fit in here?

## Hardware project specific

* What is *AAIS* in SimuQ and how to use it? Should I learn it?
* What are "decimated readouts" in QICK, and is it relevant?
* What is a "Drag" pulse (as defined in Qiskit) and is it useful? Why or why not?
* How relevant is [QUASAR](https://arxiv.org/abs/1909.11719) here?
