// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFaqArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFaqArgs Empty = new GetFaqArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Index ID
     * 
     */
    @Import(name="indexId", required=true)
    private Output<String> indexId;

    /**
     * @return Index ID
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }

    private GetFaqArgs() {}

    private GetFaqArgs(GetFaqArgs $) {
        this.id = $.id;
        this.indexId = $.indexId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFaqArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFaqArgs $;

        public Builder() {
            $ = new GetFaqArgs();
        }

        public Builder(GetFaqArgs defaults) {
            $ = new GetFaqArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param indexId Index ID
         * 
         * @return builder
         * 
         */
        public Builder indexId(Output<String> indexId) {
            $.indexId = indexId;
            return this;
        }

        /**
         * @param indexId Index ID
         * 
         * @return builder
         * 
         */
        public Builder indexId(String indexId) {
            return indexId(Output.of(indexId));
        }

        public GetFaqArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.indexId = Objects.requireNonNull($.indexId, "expected parameter 'indexId' to be non-null");
            return $;
        }
    }

}
