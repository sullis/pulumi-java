// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Streaming.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamArgs Empty = new GetStreamArgs();

    /**
     * The OCID of the stream.
     * 
     */
    @Import(name="streamId", required=true)
    private Output<String> streamId;

    /**
     * @return The OCID of the stream.
     * 
     */
    public Output<String> streamId() {
        return this.streamId;
    }

    private GetStreamArgs() {}

    private GetStreamArgs(GetStreamArgs $) {
        this.streamId = $.streamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamArgs $;

        public Builder() {
            $ = new GetStreamArgs();
        }

        public Builder(GetStreamArgs defaults) {
            $ = new GetStreamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param streamId The OCID of the stream.
         * 
         * @return builder
         * 
         */
        public Builder streamId(Output<String> streamId) {
            $.streamId = streamId;
            return this;
        }

        /**
         * @param streamId The OCID of the stream.
         * 
         * @return builder
         * 
         */
        public Builder streamId(String streamId) {
            return streamId(Output.of(streamId));
        }

        public GetStreamArgs build() {
            $.streamId = Objects.requireNonNull($.streamId, "expected parameter 'streamId' to be non-null");
            return $;
        }
    }

}
