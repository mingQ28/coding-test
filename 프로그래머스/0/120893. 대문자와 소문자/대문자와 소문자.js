const solution = (my_string) => {
    return [...my_string].map(x => /[A-Z]/.test(x) ? x.toLowerCase() : x.toUpperCase()).join("");
}