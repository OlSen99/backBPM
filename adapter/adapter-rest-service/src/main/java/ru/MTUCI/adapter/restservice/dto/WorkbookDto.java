/*
 * Copyright (c) 2008-2013
 * LANIT
 * All rights reserved.
 *
 * This product and related documentation are protected by copyright and
 * distributed under licenses restricting its use, copying, distribution, and
 * decompilation. No part of this product or related documentation may be
 * reproduced in any form by any means without prior written authorization of
 * LANIT and its licensors, if any.
 *
 * $Id$
 */
package ru.MTUCI.adapter.restservice.dto;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.IOException;
import java.io.OutputStream;

public class WorkbookDto implements StreamedDto {
    private final Workbook workbook;

    public WorkbookDto(Workbook workbook) {
        this.workbook = workbook;
    }

    @Override
    public void write(OutputStream outputStream) throws IOException {
        workbook.write(outputStream);
    }
}
