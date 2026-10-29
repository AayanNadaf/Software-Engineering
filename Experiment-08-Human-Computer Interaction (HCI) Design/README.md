# SOFTWARE ENGINEERING LAB • PRACTICAL RECORD

# EXPERIMENT 8 — Human-Computer Interaction (HCI) Design
**Design and compare different HCI designs**

| Student name | Roll number | Class / division | Subject |
|---|---|---|---|
| Aayan Vajir Nadaf | A124 | TY-CSE (A) | Software Engineering |

## Aim
To study and compare GUI, command-line, voice, and touch interfaces and apply usability principles to a student login screen.

## Objectives
- Understand Human-Computer Interaction.
- Compare different interaction styles.
- Apply consistency, feedback, simplicity, error prevention, and accessibility principles.

## 1. Theory
Human-Computer Interaction (HCI) studies how people interact with computer systems and how interfaces can be designed to be usable, efficient, accessible, and satisfying.

## 2. HCI interface types
| Interface | Interaction method | Advantages | Limitations / example |
|---|---|---|---|
| Graphical User Interface (GUI) | Windows, icons, menus, buttons | Visually discoverable and familiar. | Needs screen space; desktop apps and portals. |
| Command-Line Interface (CLI) | Typed commands | Efficient for experienced users and automation. | Syntax must be learned; Linux Terminal. |
| Voice User Interface (VUI) | Spoken commands and responses | Can support hands-free interaction. | Noise or recognition errors; voice assistants. |
| Touch Interface | Taps, swipes, gestures | Direct and intuitive on mobile devices. | Small targets can be difficult; smartphone apps. |

## 3. Diagram: Student portal login wireframe
```text
+------------------------------------+
|          STUDENT PORTAL            |
|                                    |
|  Student ID                        |
|  [____________________________]    |
|                                    |
|  Password                          |
|  [____________________________]    |
|                                    |
|  [          SIGN IN           ]    |
|                                    |
|  Feedback / error message appears  |
|  here when required.               |
+------------------------------------+
```

## 4. HCI principles applied
| Principle | Application to login screen |
|---|---|
| Consistency | Use uniform fonts, spacing, labels, and button styles. |
| Visibility | Keep Student ID and Password labels clearly visible. |
| Feedback | Show a message when sign-in is submitted or an error occurs. |
| Error prevention | Validate required fields and provide understandable messages. |
| Accessibility | Support keyboard navigation, readable contrast, and assistive technology. |

## 5. Practical evaluation / demo
1. Ask a user to locate the Student ID and Password fields.
2. Ask the user to submit the form with empty fields and observe the feedback.
3. Ask the user to correct the fields and submit again.
4. Check that labels, button focus, contrast, and error messages are understandable.
5. Record issues and revise the prototype.

## 6. Comparison
| Feature | GUI | CLI | Voice UI | Touch UI |
|---|---|---|---|---|
| Input | Mouse/keyboard | Text commands | Speech | Tap/gesture |
| Beginner ease | Usually high | Usually low | Varies by context | Usually high |
| Expert efficiency | High | Very high for suitable tasks | Variable | High for simple tasks |
| Key consideration | Visual clarity and keyboard access | Command accuracy and help | Noise and recognition accuracy | Target size and gesture discoverability |

> **Note:** The wireframe is a design diagram, not a working authentication system.

## Result
Different HCI designs were compared and a student login interface was specified using core usability principles. The most suitable interface depends on user needs, task, environment, and accessibility requirements.
