package example.jllarraz.com.passportreader.utils

import android.util.Log
import net.sf.scuba.smartcards.APDUWrapper
import net.sf.scuba.smartcards.CommandAPDU
import net.sf.scuba.smartcards.ResponseAPDU

class DebugAPDUWrapper : APDUWrapper {

    private val TAG = "APDUDEBUG"

    /**
     * Wraps the command APDU buffer.
     *
     * @param capdu the command APDU
     *
     * @return the wrapped APDU
     */
    override fun wrap(capdu: CommandAPDU?): CommandAPDU {
        Log.e(TAG, capdu!!.toString())
        return capdu!!
    }

    /**
     * An indication of the type of wrapper.
     *
     * @return the type of wrapper
     */
    override fun getType(): String {
        return "DEBUGAPDUWrapper"
    }

    /**
     * Unwraps the response APDU buffer.
     *
     * @param rapdu the response APDU
     *
     * @return the wrapped APDU
     */
    override fun unwrap(rapdu: ResponseAPDU?): ResponseAPDU {
        Log.d(TAG, rapdu?.toString())
        return rapdu!!
    }

}