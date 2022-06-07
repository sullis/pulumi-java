// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationSetArgs Empty = new GetReplicationSetArgs();

    /**
     * The ARN of the ReplicationSet.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The ARN of the ReplicationSet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetReplicationSetArgs() {}

    private GetReplicationSetArgs(GetReplicationSetArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationSetArgs $;

        public Builder() {
            $ = new GetReplicationSetArgs();
        }

        public Builder(GetReplicationSetArgs defaults) {
            $ = new GetReplicationSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the ReplicationSet.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the ReplicationSet.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetReplicationSetArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
