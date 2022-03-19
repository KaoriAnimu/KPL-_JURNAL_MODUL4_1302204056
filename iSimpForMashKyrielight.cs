using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KPL_JURNAL_MOD4_1302204056
{
    public class Sheba<T>
    {
        private List<T> storedData ;

        private List<DateTime> inputDates ;

        public Sheba()
        {

            storedData = new List<T>() ;

            inputDates = new List<DateTime>() ;

        }

        public void AddNewSheba(T databaru)
        {
            storedData.Add(databaru) ;

            inputDates.Add(DateTime.Now) ;

        }

        public void PPPrintAllSheba()
        {
            for (int SayangEreshkigal = 0; SayangEreshkigal < storedData.Count; SayangEreshkigal++)
            {
                Console.WriteLine(" Current Data " + (SayangEreshkigal + 1) + "\n Filled : " + 

                    storedData[SayangEreshkigal] + "\n Time that is kept by UTC : " + 

                    inputDates[SayangEreshkigal] + "\n AM ") ;
            }
        }
    }
}

// NIM = 1302204056