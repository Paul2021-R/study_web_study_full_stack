#include <iostream>


class FoolException : std::exception {
};

class Sample {
	public:
		void sayNick(std::string nick) {
			if(nick == "fool") 
				throw FoolException();
			std::cout << "당신의 별명은 " << nick << "입니다" << std::endl;
    }
};


int main(void) {
	Sample sample = Sample();
	try {
		sample.sayNick("fool");
		sample.sayNick("genious");
	}
	catch(FoolException e) {
		std::cout << "FoolException이 발생했습니다." << std::endl;
	}
	
}
