// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventSourceMappingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventSourceMappingPlainArgs Empty = new GetEventSourceMappingPlainArgs();

    /**
     * Event Source Mapping Identifier UUID.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Event Source Mapping Identifier UUID.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetEventSourceMappingPlainArgs() {}

    private GetEventSourceMappingPlainArgs(GetEventSourceMappingPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventSourceMappingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventSourceMappingPlainArgs $;

        public Builder() {
            $ = new GetEventSourceMappingPlainArgs();
        }

        public Builder(GetEventSourceMappingPlainArgs defaults) {
            $ = new GetEventSourceMappingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Event Source Mapping Identifier UUID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetEventSourceMappingPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
