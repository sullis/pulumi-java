// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelClearTimerArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelDynamoDBArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelDynamoDBv2Args;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelFirehoseArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelIotEventsArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelIotSiteWiseArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelIotTopicPublishArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelLambdaArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelResetTimerArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelSetTimerArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelSetVariableArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelSnsArgs;
import io.pulumi.awsnative.iotevents.inputs.DetectorModelSqsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The actions to be performed.
 * 
 */
public final class DetectorModelActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelActionArgs Empty = new DetectorModelActionArgs();

    @Import(name="clearTimer")
      private final @Nullable Output<DetectorModelClearTimerArgs> clearTimer;

    public Output<DetectorModelClearTimerArgs> clearTimer() {
        return this.clearTimer == null ? Codegen.empty() : this.clearTimer;
    }

    @Import(name="dynamoDB")
      private final @Nullable Output<DetectorModelDynamoDBArgs> dynamoDB;

    public Output<DetectorModelDynamoDBArgs> dynamoDB() {
        return this.dynamoDB == null ? Codegen.empty() : this.dynamoDB;
    }

    @Import(name="dynamoDBv2")
      private final @Nullable Output<DetectorModelDynamoDBv2Args> dynamoDBv2;

    public Output<DetectorModelDynamoDBv2Args> dynamoDBv2() {
        return this.dynamoDBv2 == null ? Codegen.empty() : this.dynamoDBv2;
    }

    @Import(name="firehose")
      private final @Nullable Output<DetectorModelFirehoseArgs> firehose;

    public Output<DetectorModelFirehoseArgs> firehose() {
        return this.firehose == null ? Codegen.empty() : this.firehose;
    }

    @Import(name="iotEvents")
      private final @Nullable Output<DetectorModelIotEventsArgs> iotEvents;

    public Output<DetectorModelIotEventsArgs> iotEvents() {
        return this.iotEvents == null ? Codegen.empty() : this.iotEvents;
    }

    @Import(name="iotSiteWise")
      private final @Nullable Output<DetectorModelIotSiteWiseArgs> iotSiteWise;

    public Output<DetectorModelIotSiteWiseArgs> iotSiteWise() {
        return this.iotSiteWise == null ? Codegen.empty() : this.iotSiteWise;
    }

    @Import(name="iotTopicPublish")
      private final @Nullable Output<DetectorModelIotTopicPublishArgs> iotTopicPublish;

    public Output<DetectorModelIotTopicPublishArgs> iotTopicPublish() {
        return this.iotTopicPublish == null ? Codegen.empty() : this.iotTopicPublish;
    }

    @Import(name="lambda")
      private final @Nullable Output<DetectorModelLambdaArgs> lambda;

    public Output<DetectorModelLambdaArgs> lambda() {
        return this.lambda == null ? Codegen.empty() : this.lambda;
    }

    @Import(name="resetTimer")
      private final @Nullable Output<DetectorModelResetTimerArgs> resetTimer;

    public Output<DetectorModelResetTimerArgs> resetTimer() {
        return this.resetTimer == null ? Codegen.empty() : this.resetTimer;
    }

    @Import(name="setTimer")
      private final @Nullable Output<DetectorModelSetTimerArgs> setTimer;

    public Output<DetectorModelSetTimerArgs> setTimer() {
        return this.setTimer == null ? Codegen.empty() : this.setTimer;
    }

    @Import(name="setVariable")
      private final @Nullable Output<DetectorModelSetVariableArgs> setVariable;

    public Output<DetectorModelSetVariableArgs> setVariable() {
        return this.setVariable == null ? Codegen.empty() : this.setVariable;
    }

    @Import(name="sns")
      private final @Nullable Output<DetectorModelSnsArgs> sns;

    public Output<DetectorModelSnsArgs> sns() {
        return this.sns == null ? Codegen.empty() : this.sns;
    }

    @Import(name="sqs")
      private final @Nullable Output<DetectorModelSqsArgs> sqs;

    public Output<DetectorModelSqsArgs> sqs() {
        return this.sqs == null ? Codegen.empty() : this.sqs;
    }

    public DetectorModelActionArgs(
        @Nullable Output<DetectorModelClearTimerArgs> clearTimer,
        @Nullable Output<DetectorModelDynamoDBArgs> dynamoDB,
        @Nullable Output<DetectorModelDynamoDBv2Args> dynamoDBv2,
        @Nullable Output<DetectorModelFirehoseArgs> firehose,
        @Nullable Output<DetectorModelIotEventsArgs> iotEvents,
        @Nullable Output<DetectorModelIotSiteWiseArgs> iotSiteWise,
        @Nullable Output<DetectorModelIotTopicPublishArgs> iotTopicPublish,
        @Nullable Output<DetectorModelLambdaArgs> lambda,
        @Nullable Output<DetectorModelResetTimerArgs> resetTimer,
        @Nullable Output<DetectorModelSetTimerArgs> setTimer,
        @Nullable Output<DetectorModelSetVariableArgs> setVariable,
        @Nullable Output<DetectorModelSnsArgs> sns,
        @Nullable Output<DetectorModelSqsArgs> sqs) {
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

    private DetectorModelActionArgs() {
        this.clearTimer = Codegen.empty();
        this.dynamoDB = Codegen.empty();
        this.dynamoDBv2 = Codegen.empty();
        this.firehose = Codegen.empty();
        this.iotEvents = Codegen.empty();
        this.iotSiteWise = Codegen.empty();
        this.iotTopicPublish = Codegen.empty();
        this.lambda = Codegen.empty();
        this.resetTimer = Codegen.empty();
        this.setTimer = Codegen.empty();
        this.setVariable = Codegen.empty();
        this.sns = Codegen.empty();
        this.sqs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DetectorModelClearTimerArgs> clearTimer;
        private @Nullable Output<DetectorModelDynamoDBArgs> dynamoDB;
        private @Nullable Output<DetectorModelDynamoDBv2Args> dynamoDBv2;
        private @Nullable Output<DetectorModelFirehoseArgs> firehose;
        private @Nullable Output<DetectorModelIotEventsArgs> iotEvents;
        private @Nullable Output<DetectorModelIotSiteWiseArgs> iotSiteWise;
        private @Nullable Output<DetectorModelIotTopicPublishArgs> iotTopicPublish;
        private @Nullable Output<DetectorModelLambdaArgs> lambda;
        private @Nullable Output<DetectorModelResetTimerArgs> resetTimer;
        private @Nullable Output<DetectorModelSetTimerArgs> setTimer;
        private @Nullable Output<DetectorModelSetVariableArgs> setVariable;
        private @Nullable Output<DetectorModelSnsArgs> sns;
        private @Nullable Output<DetectorModelSqsArgs> sqs;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelActionArgs defaults) {
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

        public Builder clearTimer(@Nullable Output<DetectorModelClearTimerArgs> clearTimer) {
            this.clearTimer = clearTimer;
            return this;
        }
        public Builder clearTimer(@Nullable DetectorModelClearTimerArgs clearTimer) {
            this.clearTimer = Codegen.ofNullable(clearTimer);
            return this;
        }
        public Builder dynamoDB(@Nullable Output<DetectorModelDynamoDBArgs> dynamoDB) {
            this.dynamoDB = dynamoDB;
            return this;
        }
        public Builder dynamoDB(@Nullable DetectorModelDynamoDBArgs dynamoDB) {
            this.dynamoDB = Codegen.ofNullable(dynamoDB);
            return this;
        }
        public Builder dynamoDBv2(@Nullable Output<DetectorModelDynamoDBv2Args> dynamoDBv2) {
            this.dynamoDBv2 = dynamoDBv2;
            return this;
        }
        public Builder dynamoDBv2(@Nullable DetectorModelDynamoDBv2Args dynamoDBv2) {
            this.dynamoDBv2 = Codegen.ofNullable(dynamoDBv2);
            return this;
        }
        public Builder firehose(@Nullable Output<DetectorModelFirehoseArgs> firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder firehose(@Nullable DetectorModelFirehoseArgs firehose) {
            this.firehose = Codegen.ofNullable(firehose);
            return this;
        }
        public Builder iotEvents(@Nullable Output<DetectorModelIotEventsArgs> iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        public Builder iotEvents(@Nullable DetectorModelIotEventsArgs iotEvents) {
            this.iotEvents = Codegen.ofNullable(iotEvents);
            return this;
        }
        public Builder iotSiteWise(@Nullable Output<DetectorModelIotSiteWiseArgs> iotSiteWise) {
            this.iotSiteWise = iotSiteWise;
            return this;
        }
        public Builder iotSiteWise(@Nullable DetectorModelIotSiteWiseArgs iotSiteWise) {
            this.iotSiteWise = Codegen.ofNullable(iotSiteWise);
            return this;
        }
        public Builder iotTopicPublish(@Nullable Output<DetectorModelIotTopicPublishArgs> iotTopicPublish) {
            this.iotTopicPublish = iotTopicPublish;
            return this;
        }
        public Builder iotTopicPublish(@Nullable DetectorModelIotTopicPublishArgs iotTopicPublish) {
            this.iotTopicPublish = Codegen.ofNullable(iotTopicPublish);
            return this;
        }
        public Builder lambda(@Nullable Output<DetectorModelLambdaArgs> lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder lambda(@Nullable DetectorModelLambdaArgs lambda) {
            this.lambda = Codegen.ofNullable(lambda);
            return this;
        }
        public Builder resetTimer(@Nullable Output<DetectorModelResetTimerArgs> resetTimer) {
            this.resetTimer = resetTimer;
            return this;
        }
        public Builder resetTimer(@Nullable DetectorModelResetTimerArgs resetTimer) {
            this.resetTimer = Codegen.ofNullable(resetTimer);
            return this;
        }
        public Builder setTimer(@Nullable Output<DetectorModelSetTimerArgs> setTimer) {
            this.setTimer = setTimer;
            return this;
        }
        public Builder setTimer(@Nullable DetectorModelSetTimerArgs setTimer) {
            this.setTimer = Codegen.ofNullable(setTimer);
            return this;
        }
        public Builder setVariable(@Nullable Output<DetectorModelSetVariableArgs> setVariable) {
            this.setVariable = setVariable;
            return this;
        }
        public Builder setVariable(@Nullable DetectorModelSetVariableArgs setVariable) {
            this.setVariable = Codegen.ofNullable(setVariable);
            return this;
        }
        public Builder sns(@Nullable Output<DetectorModelSnsArgs> sns) {
            this.sns = sns;
            return this;
        }
        public Builder sns(@Nullable DetectorModelSnsArgs sns) {
            this.sns = Codegen.ofNullable(sns);
            return this;
        }
        public Builder sqs(@Nullable Output<DetectorModelSqsArgs> sqs) {
            this.sqs = sqs;
            return this;
        }
        public Builder sqs(@Nullable DetectorModelSqsArgs sqs) {
            this.sqs = Codegen.ofNullable(sqs);
            return this;
        }        public DetectorModelActionArgs build() {
            return new DetectorModelActionArgs(clearTimer, dynamoDB, dynamoDBv2, firehose, iotEvents, iotSiteWise, iotTopicPublish, lambda, resetTimer, setTimer, setVariable, sns, sqs);
        }
    }
}
