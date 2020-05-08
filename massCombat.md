# Mass Combat #


### Unit Quality

Unit Grade to Command Points:

| Unit Grade | Base Command Points | Max Command Points |
| --- | --- | --- |
| A | 4 | 9 |
| B | 3 | 7 |
| C | 2 | 5 |
| D | 1 | 3 |
| E | 0 | 1 |

Fighting Strenght Penalties:

| Unit Health | Survivors | Support Penality | Assault Penalty |
| --- | --- | --- | --- |
| Full | 100% | 0 | 0 |
| 1 Damage | 90% | -1 | -1 |
| 2 Damage | 70% | -2 | -2 |
| 3 Damage | 40% | -3 | -3 |

### Infantry Units

Light Infantry:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 2 | 3 |
| B | 2 | 2 |
| C | 1 | 1 |
| D | 1 | 0 |
| E | 0 | 0 |

Heavy Infantry:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 2 | 5 |
| B | 2 | 4 |
| C | 1 | 3 |
| D | 1 | 2 |
| E | 0 | 1 |

Skirmish Infantry: 

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 4 | 1 |
| B | 3 | 1 |
| C | 2 | 0 |
| D | 2 | 0 |
| E | 1 | 0 |

### Cavalry Units

Light Cavalry:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 4 | 3 |
| B | 3 | 2 |
| C | 2 | 1 |
| D | 2 | 0 |
| E | 1 | 0 |

Heavy Cavalry:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 2 | 7 |
| B | 2 | 6 |
| C | 1 | 5 |
| D | 1 | 4 |
| E | 0 | 3 |

### Turn Order

1. Missile volleys

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Volley' | An _Acher Unit_ targets one enemy unit within 4 hexes with a volley of missiles | 1c | Target unit must 'Endure Missiles' or 'Take Damage from Missiles' |
| 'Hold' | The unit does nothing; non _Archer Units_ must hold | 0c | None |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Endure Missiles' | A unit targeted by a 'Volley' of missiles uses its discipline to endure the attack, avoiding damage | 1c | None |
| 'Take Damage from Missiles' | A unit targeted by a 'Volley' of missiles is damaged by the attack | 1d | None |

2. Movement

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Advance'x | The unit moves up to 3 hexes, stopping closer to an enemy unit than it started | 0c | None |
| 'Disengage' | A unit, adjacent to an enemy unit, moves one hex, becoming adjacent to no enemy units | 2c | The adjacent enemy unit with lowest command points must 'Pursue' or 'Allow Disengagement' |
| 'Engage' | A unit, adjacent to an enemy unit, holds position | 0c | None |
| 'Hold' | A unit, adjacent to no enemy units, holds position | 1c | None |
| 'Manuveur' | A unit, adjacent to no enemy units, moves up to 2 hexes | 1c | None |
| 'Charge' | A _Cavalry Unit_, adjacent to no enemy units, moves up to 6 hexes, ending adjacent to a targeted enemy unit. During the combat phase, the _Cavalry Unit_ is committed to 'Attack' the targeted enemy unit | Target unit, if infantry, must 'Endure Cavalry Charge' |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Endure Cavalry Charge' | An _Infantry Unit_ targeted by a 'Charge' holds firm | 1c | None |
| 'Pursue' | The unit moves into the space formerly occupied by the disengaging unit | 0c | None |
| 'Allow Disengagement ' | The unit does nothing, allowing the disengaging unit to retreat | 1c | None |

3. Combat Declarations

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Attack' | A non _Archery Unit_ unit attacks target adjacent enemy unit | 1c | Target unit must 'Defend' |
| 'Support Attack' | A non _Archery Unit_  unit adjacent to both an attacking ally unit and the target enemy unit supports the attack | 0c | None |
| 'Hold' | The unit does nothing | 0c | None |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Defend' | The target unit under 'Attack' defends itself and cannot take any actions during the Defense Declarations stage | 0c | None |

4. Defense Declarations

During defense declarations, it is the units of the off-turn player which act.

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Support Defense' | A non _Archery Unit_ unit adjacent to both a defending ally unit and any enemy unit supports the defense of the target defending unit | 0c | None |
| 'Hold' | The unit does nothing | 0c | None |

5. Resolve Combat

For each pair of attacking and defending units, resolve the attack in the order chosen by the player whose turn it is. Add up the _Assault_ score of the attacking unit plus the _Support_ score of all units supporting that attack. Likewise add up the _Assault_ score for the defending unit plus the _Support_ score of all units supporting that defense. The side with the higher total wins. Note: it is possible for a defending unit to be the defender in multiple attacks; in such a case those ally units that are supporting the defense provide support for each attack. If a defending unit is routed, ignore all remaining attacks involving that unit. The losing side of the attack must take the 'Lose Attack' reaction:

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Lose Attack' | The losing unit takes casualties but holds on | 2c 1d | None |

### Universal Reactions

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Rout' | At any time, a unit may 'Route' in place of taking an action or reaction. Any unit that takes 4 damage automatically 'Routes'. Remove the routed unit from the field. | 0c | Allied units of lower grade than the routed unit must make a 'Moral Check'. If the routed unit routed as the result of losing combat as the defender, the attacking unit must 'Slaughter the Survivors' or 'Allow Survivors to Escape' |
| 'Moral Check' | The unit holds firm, even as ally units break and flee | 1c | None |
| 'Slaughter the Survivors' | The victorious attacking unit chases down the routed survivors, killing or capturing them all. Removed the victorious unit from the field | 0c | None |
| 'Allow Survivors to Escape' | The victorious attacking unit holds its position on the battle field | 1c | None |

### Unit Actions

Fire arrow 1c
Assault 1c
Hold position against retreating enemy 1c
Retreat 2c
Cavalry charge 1c
Face cavalry charge 1c
Moral check 1c
Cavalry slaughter routed enemy 0c
Cavalry allow enemy to rout 2c
Withstand archer volley 1c
Injured by archer volley 1d
Rout 0c
Take damage and endure 2c 1d