// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventSourceMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventSourceMappingArgs Empty = new GetEventSourceMappingArgs();

    /**
     * Event Source Mapping Identifier UUID.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Event Source Mapping Identifier UUID.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetEventSourceMappingArgs() {}

    private GetEventSourceMappingArgs(GetEventSourceMappingArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventSourceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventSourceMappingArgs $;

        public Builder() {
            $ = new GetEventSourceMappingArgs();
        }

        public Builder(GetEventSourceMappingArgs defaults) {
            $ = new GetEventSourceMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Event Source Mapping Identifier UUID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Event Source Mapping Identifier UUID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetEventSourceMappingArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
