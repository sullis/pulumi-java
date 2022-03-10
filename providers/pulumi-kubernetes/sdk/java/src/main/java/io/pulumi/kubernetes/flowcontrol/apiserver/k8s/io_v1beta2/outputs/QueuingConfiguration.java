// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QueuingConfiguration {
    /**
     * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    private final @Nullable Integer handSize;
    /**
     * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    private final @Nullable Integer queueLengthLimit;
    /**
     * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    private final @Nullable Integer queues;

    @OutputCustomType.Constructor
    private QueuingConfiguration(
        @OutputCustomType.Parameter("handSize") @Nullable Integer handSize,
        @OutputCustomType.Parameter("queueLengthLimit") @Nullable Integer queueLengthLimit,
        @OutputCustomType.Parameter("queues") @Nullable Integer queues) {
        this.handSize = handSize;
        this.queueLengthLimit = queueLengthLimit;
        this.queues = queues;
    }

    /**
     * `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request's flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
    */
    public Optional<Integer> getHandSize() {
        return Optional.ofNullable(this.handSize);
    }
    /**
     * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
    */
    public Optional<Integer> getQueueLengthLimit() {
        return Optional.ofNullable(this.queueLengthLimit);
    }
    /**
     * `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
    */
    public Optional<Integer> getQueues() {
        return Optional.ofNullable(this.queues);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueuingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer handSize;
        private @Nullable Integer queueLengthLimit;
        private @Nullable Integer queues;

        public Builder() {
    	      // Empty
        }

        public Builder(QueuingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.handSize = defaults.handSize;
    	      this.queueLengthLimit = defaults.queueLengthLimit;
    	      this.queues = defaults.queues;
        }

        public Builder setHandSize(@Nullable Integer handSize) {
            this.handSize = handSize;
            return this;
        }

        public Builder setQueueLengthLimit(@Nullable Integer queueLengthLimit) {
            this.queueLengthLimit = queueLengthLimit;
            return this;
        }

        public Builder setQueues(@Nullable Integer queues) {
            this.queues = queues;
            return this;
        }
        public QueuingConfiguration build() {
            return new QueuingConfiguration(handSize, queueLengthLimit, queues);
        }
    }
}
