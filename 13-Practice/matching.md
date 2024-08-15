# Macthing Symbol
<table>
  <tr>
    <th>Regular Expression</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>.</td>
    <td>Any Character</td>
  </tr>
  <tr>
    <td>[abc] </td>
    <td>Exactly given letters</td>
  </tr>

  <tr>
    <td>[abc][vz] </td>
    <td>Either first or second set</td>
  </tr>
  <tr>
    <td>[^abc] </td>
    <td>Except abc</td>
  </tr>
  <tr>
    <td>[a-z1-7] </td>
    <td>a-z or 1-7</td>
  </tr>
  <tr>
    <td>A|B </td>
    <td>A or B</td>
  </tr>
  <tr>
    <td>XZ </td>
    <td>Exactly XZ</td>
  </tr>
</table>

# Meta Character
<table>
  <tr>
    <th>Regular Expression</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>\d</td>
    <td>Digits</td>
  </tr>
  <tr>
    <td>\D</td>
    <td>Not Digits</td>
  </tr>
   <tr>
    <td>\s</td>
    <td>space</td>
  </tr>
   <tr>
    <td>\S</td>
    <td>Not Space</td>
  </tr>
   <tr>
    <td>\w</td>
    <td>Alphabates or Digit</td>
  </tr>
  <tr>
    <td>\W</td>
    <td>Neither Alphabates or Digit</td>
  </tr>
</table>

# Quantifiers
<table>
  <tr>
    <th>Regular Expression</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>*</td>
    <td>0 or more time</td>
  </tr>
  <tr>
    <td>+</td>
    <td>One or More</td>
  </tr>
   <tr>
    <td>?</td>
    <td>0 or 1 time</td>
  </tr>
   <tr>
    <td>{x}</td>
    <td>X times</td>
  </tr>
   <tr>
    <td>{X,Y}</td>
    <td>Between X and Y time</td>
  </tr>
</table>