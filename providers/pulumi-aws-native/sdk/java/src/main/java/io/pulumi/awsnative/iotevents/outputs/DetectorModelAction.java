// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelClearTimer;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelDynamoDB;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelDynamoDBv2;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelFirehose;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelIotEvents;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelIotSiteWise;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelIotTopicPublish;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelLambda;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelResetTimer;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelSetTimer;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelSetVariable;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelSns;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelSqs;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorModelAction {
    private final @Nullable DetectorModelClearTimer clearTimer;
    private final @Nullable DetectorModelDynamoDB dynamoDB;
    private final @Nullable DetectorModelDynamoDBv2 dynamoDBv2;
    private final @Nullable DetectorModelFirehose firehose;
    private final @Nullable DetectorModelIotEvents iotEvents;
    private final @Nullable DetectorModelIotSiteWise iotSiteWise;
    private final @Nullable DetectorModelIotTopicPublish iotTopicPublish;
    private final @Nullable DetectorModelLambda lambda;
    private final @Nullable DetectorModelResetTimer resetTimer;
    private final @Nullable DetectorModelSetTimer setTimer;
    private final @Nullable DetectorModelSetVariable setVariable;
    private final @Nullable DetectorModelSns sns;
    private final @Nullable DetectorModelSqs sqs;

    @CustomType.Constructor
    private DetectorModelAction(
        @CustomType.Parameter("clearTimer") @Nullable DetectorModelClearTimer clearTimer,
        @CustomType.Parameter("dynamoDB") @Nullable DetectorModelDynamoDB dynamoDB,
        @CustomType.Parameter("dynamoDBv2") @Nullable DetectorModelDynamoDBv2 dynamoDBv2,
        @CustomType.Parameter("firehose") @Nullable DetectorModelFirehose firehose,
        @CustomType.Parameter("iotEvents") @Nullable DetectorModelIotEvents iotEvents,
        @CustomType.Parameter("iotSiteWise") @Nullable DetectorModelIotSiteWise iotSiteWise,
        @CustomType.Parameter("iotTopicPublish") @Nullable DetectorModelIotTopicPublish iotTopicPublish,
        @CustomType.Parameter("lambda") @Nullable DetectorModelLambda lambda,
        @CustomType.Parameter("resetTimer") @Nullable DetectorModelResetTimer resetTimer,
        @CustomType.Parameter("setTimer") @Nullable DetectorModelSetTimer setTimer,
        @CustomType.Parameter("setVariable") @Nullable DetectorModelSetVariable setVariable,
        @CustomType.Parameter("sns") @Nullable DetectorModelSns sns,
        @CustomType.Parameter("sqs") @Nullable DetectorModelSqs sqs) {
        this.clearTimer = clearTimer;
        this.dynamoDB = dynamoDB;
        this.dynamoDBv2 = dynamoDBv2;
        this.firehose = firehose;
        this.iotEvents = iotEvents;
        this.iotSiteWise = iotSiteWise;
        this.iotTopicPublish = iotTopicPublish;
        this.lambda = lambda;
        this.resetTimer = resetTimer;
        this.setTimer = setTimer;
        this.setVariable = setVariable;
        this.sns = sns;
        this.sqs = sqs;
    }

    public Optional<DetectorModelClearTimer> clearTimer() {
        return Optional.ofNullable(this.clearTimer);
    }
    public Optional<DetectorModelDynamoDB> dynamoDB() {
        return Optional.ofNullable(this.dynamoDB);
    }
    public Optional<DetectorModelDynamoDBv2> dynamoDBv2() {
        return Optional.ofNullable(this.dynamoDBv2);
    }
    public Optional<DetectorModelFirehose> firehose() {
        return Optional.ofNullable(this.firehose);
    }
    public Optional<DetectorModelIotEvents> iotEvents() {
        return Optional.ofNullable(this.iotEvents);
    }
    public Optional<DetectorModelIotSiteWise> iotSiteWise() {
        return Optional.ofNullable(this.iotSiteWise);
    }
    public Optional<DetectorModelIotTopicPublish> iotTopicPublish() {
        return Optional.ofNullable(this.iotTopicPublish);
    }
    public Optional<DetectorModelLambda> lambda() {
        return Optional.ofNullable(this.lambda);
    }
    public Optional<DetectorModelResetTimer> resetTimer() {
        return Optional.ofNullable(this.resetTimer);
    }
    public Optional<DetectorModelSetTimer> setTimer() {
        return Optional.ofNullable(this.setTimer);
    }
    public Optional<DetectorModelSetVariable> setVariable() {
        return Optional.ofNullable(this.setVariable);
    }
    public Optional<DetectorModelSns> sns() {
        return Optional.ofNullable(this.sns);
    }
    public Optional<DetectorModelSqs> sqs() {
        return Optional.ofNullable(this.sqs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelClearTimer clearTimer;
        private @Nullable DetectorModelDynamoDB dynamoDB;
        private @Nullable DetectorModelDynamoDBv2 dynamoDBv2;
        private @Nullable DetectorModelFirehose firehose;
        private @Nullable DetectorModelIotEvents iotEvents;
        private @Nullable DetectorModelIotSiteWise iotSiteWise;
        private @Nullable DetectorModelIotTopicPublish iotTopicPublish;
        private @Nullable DetectorModelLambda lambda;
        private @Nullable DetectorModelResetTimer resetTimer;
        private @Nullable DetectorModelSetTimer setTimer;
        private @Nullable DetectorModelSetVariable setVariable;
        private @Nullable DetectorModelSns sns;
        private @Nullable DetectorModelSqs sqs;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clearTimer = defaults.clearTimer;
    	      this.dynamoDB = defaults.dynamoDB;
    	      this.dynamoDBv2 = defaults.dynamoDBv2;
    	      this.firehose = defaults.firehose;
    	      this.iotEvents = defaults.iotEvents;
    	      this.iotSiteWise = defaults.iotSiteWise;
    	      this.iotTopicPublish = defaults.iotTopicPublish;
    	      this.lambda = defaults.lambda;
    	      this.resetTimer = defaults.resetTimer;
    	      this.setTimer = defaults.setTimer;
    	      this.setVariable = defaults.setVariable;
    	      this.sns = defaults.sns;
    	      this.sqs = defaults.sqs;
        }

        public Builder clearTimer(@Nullable DetectorModelClearTimer clearTimer) {
            this.clearTimer = clearTimer;
            return this;
        }
        public Builder dynamoDB(@Nullable DetectorModelDynamoDB dynamoDB) {
            this.dynamoDB = dynamoDB;
            return this;
        }
        public Builder dynamoDBv2(@Nullable DetectorModelDynamoDBv2 dynamoDBv2) {
            this.dynamoDBv2 = dynamoDBv2;
            return this;
        }
        public Builder firehose(@Nullable DetectorModelFirehose firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder iotEvents(@Nullable DetectorModelIotEvents iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        public Builder iotSiteWise(@Nullable DetectorModelIotSiteWise iotSiteWise) {
            this.iotSiteWise = iotSiteWise;
            return this;
        }
        public Builder iotTopicPublish(@Nullable DetectorModelIotTopicPublish iotTopicPublish) {
            this.iotTopicPublish = iotTopicPublish;
            return this;
        }
        public Builder lambda(@Nullable DetectorModelLambda lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder resetTimer(@Nullable DetectorModelResetTimer resetTimer) {
            this.resetTimer = resetTimer;
            return this;
        }
        public Builder setTimer(@Nullable DetectorModelSetTimer setTimer) {
            this.setTimer = setTimer;
            return this;
        }
        public Builder setVariable(@Nullable DetectorModelSetVariable setVariable) {
            this.setVariable = setVariable;
            return this;
        }
        public Builder sns(@Nullable DetectorModelSns sns) {
            this.sns = sns;
            return this;
        }
        public Builder sqs(@Nullable DetectorModelSqs sqs) {
            this.sqs = sqs;
            return this;
        }        public DetectorModelAction build() {
            return new DetectorModelAction(clearTimer, dynamoDB, dynamoDBv2, firehose, iotEvents, iotSiteWise, iotTopicPublish, lambda, resetTimer, setTimer, setVariable, sns, sqs);
        }
    }
}
