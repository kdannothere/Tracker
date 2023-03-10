package com.kdan.tracker.utility

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.kdan.tracker.data.Status
import com.kdan.tracker.domain.LocationMark
import java.text.DateFormat

object Utility {

    val dateTimeFormat: DateFormat =
        DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT)

    fun setStatusTrackerOff(statusState: MutableState<Status>) =
        run { statusState.value = Status.TRACKER_IS_OFF }

    fun setStatusNoPermissions(statusState: MutableState<Status>) =
        run { statusState.value = Status.HAS_NO_PERMISSIONS }

    fun setStatusGpsOff(statusState: MutableState<Status>) =
        run { statusState.value = Status.GPS_IS_OFF }

    fun setStatusLoading(statusState: MutableState<Status>) =
        run { statusState.value = Status.LOADING }

    fun setStatusError(statusState: MutableState<Status>) =
        run { statusState.value = Status.ERROR }

}