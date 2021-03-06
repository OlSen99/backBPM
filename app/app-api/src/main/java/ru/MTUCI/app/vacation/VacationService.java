/*
 * Copyright (c) 2008-2020
 * LANIT
 * All rights reserved.
 *
 * This product and related documentation are protected by copyright and
 * distributed under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or related documentation may be
 * reproduced in any form by any means without prior written authorization of
 * LANIT and its licensors, if any.
 *
 * $
 */
package ru.MTUCI.app.vacation;

import ru.MTUCI.domain.Vacation;
import ru.MTUCI.domain.dto.VacationDto;

public interface VacationService {

    void checkVacationForAnotherExists(Vacation vacation);

    void saveVacation(Vacation vacation);

    VacationDto acceptVacation(VacationDto vacationDto);
}
