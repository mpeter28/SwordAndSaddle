# Mass Combat #

Each unit has six attributes:

1. Class
2. Grade
3. Command Points
4. Health
5. Support
6. Assault

*Class* defines the fighting and equipment style of the soldiers in a unit. There are three infantry classes, two cavalry classes, and two archer classes, for a total of seven kinds of units:

| Class | Super Class |  Description | Combat Role |
| --- | --- | --- | --- |
| Light Infantry | Infantry | Light infantry are unarmored or lightly armored. They fight with simple weapons in flexible formations and are often not professioal soldiers | Direct support, holding battle lines | 
| Heavy Infantry | Infantry | Heavily armored and armed, heavy infantry are usually elite troops. They often fight in tightly packed formatons to maximize their impact. | Assault, holding battle lines |
| Skirmish Infantry | Infantry | Skirmish infantry are quick moving auxillary troops that harass enemies with rocks, javelins, and other indirect weapons | Direct support |
| Light Cavalry | Cavalry | Lightly armed and armored mounted soldiers | Direct support, exploiting enemy vulnerabilities |
| Heavy Cavalry | Cavalry | Armored riders, often on armored horses, equiped with lances and other powerful weapons | Assault, exploiting enemy vulnerabilities |
| Archers | Archers | Archers fight indirectly, raining missiles down upon enemies from afar | Indirect support |
| Horse Archers | Archers | Elite archers who are capable of shooting from horseback and evading fights | Indirect support |

Different unit classes have different actions available to them during battles. 

*Grade* represents the qualty of a unit, measuring abstract attribute like experience, discipline, and training. There are five grades of unit: A, B, C, D, and E. Grade 'A' represents the highest quality troops of a given class. Veteran troops with high moral, top tier equipment, and high resolve are grade 'A' troops. Grade 'E' represents the worst quality troops of a given class. Raw recruits or levies with sub par or no equipment and no resolve are grade 'E'. Grades 'B', 'C' and 'D' fall between the two extremes.

*Command Points* represent the ability of units to follow orders. Command points are spent moving, attacking, and holding stressful positions on the battlefield. Command points are non replenishing, so units with low command points are constrained in their options and fighting longevity. Units with many command points have more options and can fight effectively for longer. At the start of a battle, units recievestart with command points based on their grade and the quality of the leader overseeing their army.

*Health* represent the number of soldiers in a unit. As a unit suffers casualties and takes damage, its health and fighting effectiveness deminish. Health is measured as a number of damage points. At the start of the battle, all units have zero damage points. Each time a unit is damaged in combat or by arrows, it gains a damage point. Units with 4 or more damage points are routed and removed from the battlefield.

*Support* represents the fighting capability of a unit that is assisting another unit defend itself or attack an enemy unit. As a unit accumilates damage points, the unit's Support score goes down.

*Assault* represents the fighting capability of a unit when leading an attack or defense. As a unit accumilates damage points, the unit's Assault score goes down.

### Unit Quality

Unit Grade to Command Points:

| Unit Grade | Base Command Points | Max Command Points |
| --- | --- | --- |
| A | 4 | 9 |
| B | 3 | 7 |
| C | 2 | 5 |
| D | 1 | 3 |
| E | 0 | 1 |

Health Penalties:

| Unit Health | Survivors | Support Penality | Assault Penalty |
| --- | --- | --- | --- |
| 0 Damage | 100% of unit | 0 | 0 |
| 1 Damage | 90% of unit | -1 | -1 |
| 2 Damage | 70% of unit | -2 | -2 |
| 3 Damage | 40% of unit | -3 | -3 |

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

The army whose leader rolled a higher _Leadership_ roll has choice of going first or second

1. Missile volleys

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Volley' | An _Acher Unit_ targets one enemy unit within 4 hexes with a volley of missiles | 1c | Target unit must 'Endure Missiles' or 'Take Damage from Missiles' |
| 'Hold' | The unit does nothing; non _Archer Units_ must hold | 0c | None |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Endure Missiles' | A unit targeted by a 'Volley' of missiles uses its discipline to endure the attack, avoiding damage | 1c | None |
| 'Take Damage from Missiles' | A unit targeted by a 'Volley' of missiles is damaged by the attack | 1dmg | None |

2. Movement

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Advance' | The unit moves up to 3 hexes, stopping closer to an enemy unit than it started | 0c | None |
| 'Disengage' | A unit, adjacent to an enemy unit, moves one hex, becoming adjacent to no enemy units | 2c | The adjacent enemy unit with lowest command points must 'Pursue' or 'Allow Disengagement' |
| 'Engage' | A unit, adjacent to an enemy unit, holds position | 0c | None |
| 'Hold' | A unit, adjacent to no enemy units, holds position | 1c | None |
| 'Waiting Position' | A _Light Cavalry_, _Archer_, or _Skirmish Infantry_ unit holds position | 0c | None |
| 'Manuveur' | A unit, adjacent to no enemy units, moves up to 2 hexes | 1c | None |
| 'Charge' | A _Cavalry Unit_, adjacent to no enemy units, moves up to 6 hexes, ending adjacent to a targeted enemy unit. During the combat phase, the _Cavalry Unit_ is committed to 'Attack' the targeted enemy unit | 0c | Target unit, if infantry, must 'Endure Cavalry Charge' |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Endure Cavalry Charge' | An _Infantry Unit_ targeted by a 'Charge' holds firm | 1c | None |
| 'Pursue' | The unit moves into the space formerly occupied by the disengaging unit | 0c | None |
| 'Allow Disengagement ' | The unit does nothing, allowing the disengaging unit to retreat | 1c | None |

3. Combat Declarations

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Attack' | A non _Archery Unit_ unit attacks target adjacent enemy unit | 1c | Target unit must 'Defend' or 'Feint' |
| 'Support Attack' | A non _Archery Unit_  unit adjacent to both an attacking ally unit and the target enemy unit supports the attack | 0c | None |
| 'Hold' | The unit does nothing | 0c | None |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Defend' | The target unit under 'Attack' defends itself and cannot take any actions during the Defense Declarations stage | 0c | None |
| 'Feint' | The attacked _Skirmish_ or _Horse Archer_ pulls back when attacked, negating the attack. Move the attacked unit one hex away from the attacking unit. | 2c | None |

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
| 'Lose Attack' | The losing unit takes casualties but holds on | 2c 1dmg | None |

### Universal Reactions

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Rout' | At any time, a unit may 'Route' in place of taking an action or reaction. Any unit that takes 4 damage automatically 'Routes'. Remove the routed unit from the field. | 0c | Allied units of lower grade than the routed unit must make a 'Moral Check'. If the routed unit routed as the result of losing combat as the defender, the attacking unit must 'Slaughter the Survivors' or 'Allow Survivors to Escape' |
| 'Moral Check' | The unit holds firm, even as ally units break and flee | 1c | None |
| 'Slaughter the Survivors' | The victorious attacking unit chases down the routed survivors, killing or capturing them all. Removed the victorious unit from the field | 0c | None |
| 'Allow Survivors to Escape' | The victorious attacking unit holds its position on the battle field | 1c | None |
