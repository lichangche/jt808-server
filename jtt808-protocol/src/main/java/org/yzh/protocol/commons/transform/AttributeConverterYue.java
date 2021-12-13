package org.yzh.protocol.commons.transform;

import io.github.yezhihao.protostar.DataType;
import io.github.yezhihao.protostar.PrepareLoadStrategy;
import io.github.yezhihao.protostar.ProtostarUtil;
import io.github.yezhihao.protostar.schema.MapSchema;
import io.github.yezhihao.protostar.schema.NumberSchema;
import org.yzh.protocol.commons.transform.attribute.*;

/**
 * 位置附加信息转换器(粤标)
 * @author yezhihao
 * https://gitee.com/yezhihao/jt808-server
 */
public class AttributeConverterYue extends MapSchema<Integer, Object> {

    public AttributeConverterYue() {
        super(NumberSchema.BYTE_INT, 1);
    }

    @Override
    protected void addSchemas(PrepareLoadStrategy schemaRegistry) {
        schemaRegistry
                .addSchema(AttributeId.Mileage, DataType.DWORD)
                .addSchema(AttributeId.Gas, DataType.WORD)
                .addSchema(AttributeId.Speed, DataType.WORD)
                .addSchema(AttributeId.AlarmEventId, DataType.WORD)
                .addSchema(AttributeId.TirePressure, TirePressure.Schema.INSTANCE)
                .addSchema(AttributeId.CarriageTemperature, DataType.WORD)

                .addSchema(AttributeId.OverSpeedAlarm, OverSpeedAlarm.Schema.INSTANCE)
                .addSchema(AttributeId.InOutAreaAlarm, InOutAreaAlarm.Schema.INSTANCE)
                .addSchema(AttributeId.RouteDriveTimeAlarm, RouteDriveTimeAlarm.Schema.INSTANCE)

                .addSchema(AttributeId.Signal, DataType.DWORD)
                .addSchema(AttributeId.IoState, DataType.WORD)
                .addSchema(AttributeId.AnalogQuantity, DataType.DWORD)
                .addSchema(AttributeId.SignalStrength, DataType.BYTE)
                .addSchema(AttributeId.GnssCount, DataType.BYTE)


                .addSchema(AttributeId.AlarmADAS, ProtostarUtil.getRuntimeSchema(AlarmADAS.class, 1))
                .addSchema(AttributeId.AlarmBSD, ProtostarUtil.getRuntimeSchema(AlarmBSD.class, 1))
                .addSchema(AttributeId.AlarmDSM, ProtostarUtil.getRuntimeSchema(AlarmDSM.class, 1))
                .addSchema(AttributeId.AlarmTPMS, ProtostarUtil.getRuntimeSchema(AlarmTPMS.class, 1))
        ;
    }
}