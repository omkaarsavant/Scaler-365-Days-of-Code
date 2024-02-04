#include <iostream>
#include <iomanip>

int main() {
    int i;
    long l;
    char c;
    float f;
    double d;

    std::cin >> i >> l >> c >> f >> d;

    std::cout << i << "\n";
    std::cout << l << "\n";
    std::cout << c << "\n";
    std::cout << std::fixed << std::setprecision(3) << f << "\n";
    std::cout << std::fixed << std::setprecision(9) << d << "\n";

    return 0;
}
