# Mass Combat #

## Units

Each unit has six attributes:

1. Class
2. Grade
3. Command Points
4. Support
5. Assault
6. Health

*Class* defines the fighting and equipment style of the soldiers in a unit. There are three infantry classes, two cavalry classes, and two archer classes, for a total of seven kinds of units:

| Class | Super Class |  Description | Combat Role |
| --- | --- | --- | --- |
| Light Infantry | Infantry | Light infantry are unarmored or lightly armored. They fight with simple weapons in flexible formations and are often not professioal soldiers | Direct support, holding battle lines | 
| Heavy Infantry | Infantry | Heavily armored and armed, heavy infantry are usually elite troops. They often fight in tightly packed formatons to maximize their impact. | Assault, holding battle lines |
| Skirmish Infantry | Infantry | Skirmish infantry are quick moving auxillary troops that harass enemies with rocks, javelins, and other indirect weapons | Direct support |
| Light Cavalry | Cavalry | Lightly armed and armored mounted soldiers | Direct support, exploiting enemy vulnerabilities |
| Heavy Cavalry | Cavalry | Armored riders, often on armored horses, equiped with lances and other powerful weapons | Assault, exploiting enemy vulnerabilities |
| Foot Archers | Archers | Archers fight indirectly, raining missiles down upon enemies from afar | Indirect support |
| Horse Archers | Archers | Elite archers who are capable of shooting from horseback and evading fights | Indirect support |

Different unit classes have different actions available to them during battles. 

*Grade* represents the qualty of a unit, measuring abstract attribute like experience, discipline, and training. There are five grades of unit: A, B, C, D, and E. Grade 'A' represents the highest quality troops of a given class. Veteran troops with high moral, top tier equipment, and high resolve are grade 'A' troops. Grade 'E' represents the worst quality troops of a given class. Raw recruits or levies with sub par or no equipment and no resolve are grade 'E'. Grades 'B', 'C' and 'D' fall between the two extremes.

*Command Points* represent the ability of units to follow orders. Command points are spent moving, attacking, and holding stressful positions on the battlefield. Command points are non replenishing, so units with low command points are constrained in their options and fighting longevity. Units with many command points have more options and can fight effectively for longer. At the start of a battle, units recievestart with command points based on their grade and the quality of the leader overseeing their army.

*Support* represents the fighting capability of a unit that is assisting another unit defend itself or attack an enemy unit.

*Assault* represents the fighting capability of a unit when leading an attack or defense.

*Health* represent the number of soldiers in a unit. Health is measured as a number of damage points. At the start of the battle, all units have zero damage points. Each time a unit is damaged in combat or by arrows, it gains a damage point. Units with 4 or more damage points are routed and removed from the battlefield. As a unit suffers casualties and takes damage, its fighting effectiveness deminishes, as represented by penalties to its _Support_ and _Assault Score_:

| Unit Health | Survivors | Support Penality | Assault Penalty |
| --- | --- | --- | --- |
| 0 Damage | 100% of unit | 0 | 0 |
| 1 Damage | 90% of unit | -1 | -1 |
| 2 Damage | 70% of unit | -2 | -2 |
| 3 Damage | 40% of unit | -3 | -3 |

A unit cannot have negaive Support or Assault scores, regardless of how high its damage penalties are.

### Unit Quality Tables

Unit Grade to Command Points:

| Unit Grade | Base Command Points | Max Command Points |
| --- | --- | --- |
| A | 4 | 9 |
| B | 3 | 7 |
| C | 2 | 5 |
| D | 1 | 3 |
| E | 0 | 1 |

### Combat Effectiveness Tables

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

Foot Archers:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 1 | 0 |
| B | 0 | 0 |
| C | 0 | 0 |
| D | 0 | 0 |
| E | 0 | 0 |

Horse Archers:

| Unit Grade | Support | Assault |
| --- | --- | --- |
| A | 3 | 0 |
| B | 2 | 0 |
| C | 1 | 0 |
| D | 0 | 0 |
| E | 0 | 0 |

## Setting Up The Battlefield


Defensable Terrain
Impassable Terrain
Open Terrain


## Turn Order

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
| 'Attack' | A non _Archery Unit_ unit attacks target adjacent enemy unit | 0c | Target unit must 'Defend' or 'Feint' |
| 'Support Attack' | A non _Archery_  unit adjacent to an enemy unit under attack supports the attack on targeted enemy unit | 0c | None |
| 'Hold' | The unit does nothing | 0c | None |

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Defend' | The target unit under 'Attack' defends itself and cannot take any actions during the Defense Declarations stage | 0c | None |
| 'Feint' | The attacked _Skirmish_ or _Horse Archer_ pulls back when attacked, negating the attack. Move the attacked unit one hex away from the attacking unit. | 2c | None |

4. Defense Declarations

During defense declarations, it is the units of the off-turn player which act.

| Action Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Support Defense' | A non _Archery_ unit adjacent to an attacking enemy unit supports the defense of the targeted defending unit | 0c | None |
| 'Hold' | The unit does nothing | 0c | None |

5. Resolve Combat

For each pair of attacking and defending units, resolve the attack in the order chosen by the player whose turn it is. Add up the _Assault_ score of the attacking unit plus the _Support_ score of all units supporting that attack. Likewise add up the _Assault_ score for the defending unit plus the _Support_ score of all units supporting that defense. The side with the higher total wins. Note: it is possible for a defending unit to be the defender in multiple attacks; in such a case those ally units that are supporting the defense provide support for each attack. If a defending unit is routed, ignore all remaining attacks involving that unit. The losing side of the attack must take the 'Lose Attack' reaction:

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Lose Attack' | The losing unit takes casualties but holds on | 1c 1dmg | None |

### Rout Reactions

| Reaction Name | Description | Cost | Available Reactions |
| --- | --- | --- | --- |
| 'Rout' | At any time, a unit may 'Route' in place of taking an action or reaction. Any unit that takes 4 damage automatically 'Routes'. Remove the routed unit from the field. | 0c | Allied units of lower grade than the routed unit must make a 'Moral Check'. If the routed unit routed as the result of losing combat as the defender, the attacking unit must 'Slaughter the Survivors' or 'Allow Survivors to Escape' |
| 'Moral Check' | The unit holds firm, even as ally units break and flee | 1c | None |
| 'Slaughter the Survivors' | The victorious attacking unit chases down the routed survivors, killing or capturing them all. Removed the victorious unit from the field | 0c | None |
| 'Allow Survivors to Escape' | The victorious attacking unit holds its position on the battle field | 1c | None |

## Example Battle



### Harold Godwinson's Anglo-Saxon Army

| Unit Identifier | Unit Name | Class | Grade | Command Points | Health | Support | Assault |
| --- | --- | --- | --- | --- | --- | --- | --- |
| I | Fyrd | Light Infantry | D | 1 | 0 Damage | 1 | 0 |
| II | Fyrd | Light Infantry | D | 1 | 0 Damage | 1 | 0 |
| III | Fyrd | Light Infantry | C | 2 | 0 Damage | 1 | 1 |
| IV | Fyrd | Light Infantry | B | 3 | 0 Damage | 2 | 2 |
| V | Fyrd | Light Infantry | A | 4 | 0 Damage | 2 | 3 |
| VI | Housecurl | Heavy Infantry | C | 2 | 0 Damage | 1 | 3 |
| VII | Housecurl | Heavy Infantry | B | 3 | 0 Damage | 2 | 4 |
| VIII | Housecurl | Heavy Infantry | B | 3 | 0 Damage | 2 | 4 |
| IX | Harolds's Housecurl | Heavy Infantry | A | 4 | 0 Damage | 2 | 5 |

18 command points for Harold.

| Unit Identifier | Unit Name | Class | Grade | Command Points | Health | Support | Assault |
| --- | --- | --- | --- | --- | --- | --- | --- |
| I | Fyrd | Light Infantry | D | 1 | 0 Damage | 1 | 0 |
| II | Fyrd | Light Infantry | D | 1 | 0 Damage | 1 | 0 |
| III | Fyrd | Light Infantry | C | 2 | 0 Damage | 1 | 1 |
| IV | Fyrd | Light Infantry | B | 6 | 0 Damage | 2 | 2 |
| V | Fyrd | Light Infantry | A | 6 | 0 Damage | 2 | 3 |
| VI | Housecurl | Heavy Infantry | C | 5 | 0 Damage | 1 | 3 |
| VII | Housecurl | Heavy Infantry | B | 6 | 0 Damage | 2 | 4 |
| VIII | Housecurl | Heavy Infantry | B | 7 | 0 Damage | 2 | 4 |
| IX | Harolds's Housecurl | Heavy Infantry | A | 7 | 0 Damage | 2 | 5 |


### William Duke of Normandy's Franco-Norman Army

| Unit Identifier | Unit Name | Class | Grade | Command Points | Health | Support | Assault |
| --- | --- | --- | --- | --- | --- | --- | --- |
| I | Longbow Men | Foot Archers | C | 2 | 0 Damage | 0 | 0 |
| II | Longbow Men | Foot Archers | B | 3 | 0 Damage | 0 | 0 |
| III | Alan the Red's Breton Contingent | Heavy Infantry | B | 3 | 0 Damage | 2 | 4 |
| IV | Williams's Norman Contingent | Heavy Infantry | A | 4 | 0 Damage | 2 | 5 |
| V | French Contingent | Heavy Infantry | C | 2 | 0 Damage | 1 | 3 |
| VI | French Knights | Heavy Cavalry | B | 3 | 0 Damage | 2 | 6 |
| VII | French Knights | Heavy Cavalry | B | 3 | 0 Damage | 2 | 6 |

18 command points from William's leadership roll are spread amongst his units as bonus command points.

| Unit Identifier | Unit Name | Class | Grade | Command Points | Health | Support | Assault |
| --- | --- | --- | --- | --- | --- | --- | --- |
| I | Longbow Men | Foot Archers | C | 4 | 0 Damage | 0 | 0 |
| II | Longbow Men | Foot Archers | B | 4 | 0 Damage | 0 | 0 |
| III | Alan the Red's Breton Contingent | Heavy Infantry | B | 6 | 0 Damage | 2 | 4 |
| IV | Williams's Norman Contingent | Heavy Infantry | A | 6 | 0 Damage | 2 | 5 |
| V | French Contingent | Heavy Infantry | C | 6 | 0 Damage | 1 | 3 |
| VI | French Knights | Heavy Cavalry | B | 6 | 0 Damage | 2 | 6 |
| VII | French Knights | Heavy Cavalry | B | 6 | 0 Damage | 2 | 6

### The Battlefield

![The Hill](/Hastings/battlegrid.svg)

![Anglo Saxon Deployment](/Hastings/haroldsArrives.svg)

![Franco Norman Deployment](/Hastings/williamArrives.svg)

### The Battle

![Early Desertions](/Hastings/fyrdOneTwoDesert.svg)

![More Desertions](/Hastings/fyrdThreeDesert.svg)

![William Advances](/Hastings/williamsLineAdvances.svg)

![French Cavalry Disengages](/Hastings/cavalryDisengage.svg)

![Housecurls Route](/Hastings/housecurlsRoute.svg)

![Fyrd Advances on Harold's Right](/Hastings/fyrdAdvances.svg)

![Second Cavalry Charge](/Hastings/secondCavalryCharge.svg)

![Harold's Left Routes](/Hastings/haroldsLeftRoutes.svg)

![Fyrd Advances on Harold's Left](/Hastings/fyrdAdvancesOnTheLeft.svg)

![Bretons Route](/Hastings/bretonsRoute.svg)

![Frence Route](/Hastings/frenchRoute.svg)

![Harold's Left Fyrd Routed](/Hastings/haroldsFyrdLeftRoute.svg)

![Harold's Left Slaughtered](/Hastings/justHaroldNow.svg)

![Final Charge](/Hastings/finalCharge.svg)

### Aftermath

William and his Franco-Norman forces won the battle; 1700 of the 7000 Franco-Norman troops, mostly Breton and French infantry, died for the victory:

| Unit Identifier | Unit Name | Fate | Casualties |
| --- | --- | --- | --- |
| I | Longbow Men | Unharmed | 0 |
| II | Longbow Men | Unharmed | 0 |
| III | Alan the Red's Breton Contingent | Killed to a man | 1000 |
| IV | Williams's Norman Contingent | Unharmed | 0 |
| V | French Contingent | Routed after suffering 3 damage | 600 |
| VI | French Knights | Suffered 1 damage; chased down and slaughtered fleeing fyrd | 100 |
| VII | French Knights | Unharmed; chased down and slaghtered Harold Godwinson | 0 |

William Duke of Normandy lived to become King of England, but his supporter Alan the Red died when the Breton contingent broke. In real life, Alan the Red survived the battle of Hastings, becoming 1st Lord of Richmond. Harold and his forces faired worse. The King and 2200 of his 9000 men died there in East Sussex:

| Unit Identifier | Unit Name | Fate | Casualties |
| --- | --- | --- | --- |
| I | Fyrd | Deserted and survived unharmed | 0 |
| II | Fyrd | Deserted and survived unharmed | 0 |
| III | Fyrd | Deserted and survived unharmed | 0 | 
| IV | Fyrd | Routed after taking 1 damage | 100 |
| V | Fyrd | Routed and slaughtered by pursuing cavalry | 1000 |
| VI | Housecurl | Routed by a cavalry charge after taking 1 damafe | 100 |
| VII | Housecurl | Routed by poor morale after fyrd unit 5 routed; unharmed | 0 |
| VIII | Housecurl | Routed by a cavalry charge; unharmed | 0 |
| IX | Harolds's Housecurl | Routed and slaughtered by pursuing cavalry | 1000 |