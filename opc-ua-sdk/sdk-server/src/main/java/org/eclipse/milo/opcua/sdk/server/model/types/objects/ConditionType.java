package org.eclipse.milo.opcua.sdk.server.model.types.objects;

import org.eclipse.milo.opcua.sdk.core.ValueRanks;
import org.eclipse.milo.opcua.sdk.core.model.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.server.model.types.variables.ConditionVariableType;
import org.eclipse.milo.opcua.sdk.server.model.types.variables.PropertyType;
import org.eclipse.milo.opcua.sdk.server.model.types.variables.TwoStateVariableType;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;

public interface ConditionType extends BaseEventType {
    QualifiedProperty<NodeId> CONDITION_CLASS_ID = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "ConditionClassId",
        NodeId.parse("ns=0;i=17"),
        ValueRanks.Scalar,
        NodeId.class
    );

    QualifiedProperty<LocalizedText> CONDITION_CLASS_NAME = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "ConditionClassName",
        NodeId.parse("ns=0;i=21"),
        ValueRanks.Scalar,
        LocalizedText.class
    );

    QualifiedProperty<String> CONDITION_NAME = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "ConditionName",
        NodeId.parse("ns=0;i=12"),
        ValueRanks.Scalar,
        String.class
    );

    QualifiedProperty<NodeId> BRANCH_ID = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "BranchId",
        NodeId.parse("ns=0;i=17"),
        ValueRanks.Scalar,
        NodeId.class
    );

    QualifiedProperty<Boolean> RETAIN = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "Retain",
        NodeId.parse("ns=0;i=1"),
        ValueRanks.Scalar,
        Boolean.class
    );

    QualifiedProperty<String> CLIENT_USER_ID = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "ClientUserId",
        NodeId.parse("ns=0;i=12"),
        ValueRanks.Scalar,
        String.class
    );

    PropertyType getConditionClassIdNode();

    NodeId getConditionClassId();

    void setConditionClassId(NodeId value);

    PropertyType getConditionClassNameNode();

    LocalizedText getConditionClassName();

    void setConditionClassName(LocalizedText value);

    PropertyType getConditionNameNode();

    String getConditionName();

    void setConditionName(String value);

    PropertyType getBranchIdNode();

    NodeId getBranchId();

    void setBranchId(NodeId value);

    PropertyType getRetainNode();

    Boolean getRetain();

    void setRetain(Boolean value);

    PropertyType getClientUserIdNode();

    String getClientUserId();

    void setClientUserId(String value);

    TwoStateVariableType getEnabledStateNode();

    LocalizedText getEnabledState();

    void setEnabledState(LocalizedText value);

    ConditionVariableType getQualityNode();

    StatusCode getQuality();

    void setQuality(StatusCode value);

    ConditionVariableType getLastSeverityNode();

    UShort getLastSeverity();

    void setLastSeverity(UShort value);

    ConditionVariableType getCommentNode();

    LocalizedText getComment();

    void setComment(LocalizedText value);
}
