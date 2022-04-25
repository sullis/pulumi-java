// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueuingConfiguration {
    /**
     * @return `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    private final @Nullable Integer handSize;
    /**
     * @return `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    private final @Nullable Integer queueLengthLimit;
    /**
     * @return `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    private final @Nullable Integer queues;

    @CustomType.Constructor
    private QueuingConfiguration(
        @CustomType.Parameter("handSize") @Nullable Integer handSize,
        @CustomType.Parameter("queueLengthLimit") @Nullable Integer queueLengthLimit,
        @CustomType.Parameter("queues") @Nullable Integer queues) {
        this.handSize = handSize;
        this.queueLengthLimit = queueLengthLimit;
        this.queues = queues;
    }

    /**
     * @return `handSize` is a small positive number that configures the shuffle sharding of requests into queues.  When enqueuing a request at this priority level the request&#39;s flow identifier (a string pair) is hashed and the hash value is used to shuffle the list of queues and deal a hand of the size specified here.  The request is put into one of the shortest queues in that hand. `handSize` must be no larger than `queues`, and should be significantly smaller (so that a few heavy flows do not saturate most of the queues).  See the user-facing documentation for more extensive guidance on setting this field.  This field has a default value of 8.
     * 
     */
    public Optional<Integer> handSize() {
        return Optional.ofNullable(this.handSize);
    }
    /**
     * @return `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue of this priority level at a time; excess requests are rejected.  This value must be positive.  If not specified, it will be defaulted to 50.
     * 
     */
    public Optional<Integer> queueLengthLimit() {
        return Optional.ofNullable(this.queueLengthLimit);
    }
    /**
     * @return `queues` is the number of queues for this priority level. The queues exist independently at each apiserver. The value must be positive.  Setting it to 1 effectively precludes shufflesharding and thus makes the distinguisher method of associated flow schemas irrelevant.  This field has a default value of 64.
     * 
     */
    public Optional<Integer> queues() {
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

        public Builder handSize(@Nullable Integer handSize) {
            this.handSize = handSize;
            return this;
        }
        public Builder queueLengthLimit(@Nullable Integer queueLengthLimit) {
            this.queueLengthLimit = queueLengthLimit;
            return this;
        }
        public Builder queues(@Nullable Integer queues) {
            this.queues = queues;
            return this;
        }        public QueuingConfiguration build() {
            return new QueuingConfiguration(handSize, queueLengthLimit, queues);
        }
    }
}
