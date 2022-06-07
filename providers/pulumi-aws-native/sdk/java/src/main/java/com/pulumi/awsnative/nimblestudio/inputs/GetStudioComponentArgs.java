// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStudioComponentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStudioComponentArgs Empty = new GetStudioComponentArgs();

    @Import(name="studioComponentId", required=true)
    private Output<String> studioComponentId;

    public Output<String> studioComponentId() {
        return this.studioComponentId;
    }

    /**
     * &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    @Import(name="studioId", required=true)
    private Output<String> studioId;

    /**
     * @return &lt;p&gt;The studioId. &lt;/p&gt;
     * 
     */
    public Output<String> studioId() {
        return this.studioId;
    }

    private GetStudioComponentArgs() {}

    private GetStudioComponentArgs(GetStudioComponentArgs $) {
        this.studioComponentId = $.studioComponentId;
        this.studioId = $.studioId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStudioComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStudioComponentArgs $;

        public Builder() {
            $ = new GetStudioComponentArgs();
        }

        public Builder(GetStudioComponentArgs defaults) {
            $ = new GetStudioComponentArgs(Objects.requireNonNull(defaults));
        }

        public Builder studioComponentId(Output<String> studioComponentId) {
            $.studioComponentId = studioComponentId;
            return this;
        }

        public Builder studioComponentId(String studioComponentId) {
            return studioComponentId(Output.of(studioComponentId));
        }

        /**
         * @param studioId &lt;p&gt;The studioId. &lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder studioId(Output<String> studioId) {
            $.studioId = studioId;
            return this;
        }

        /**
         * @param studioId &lt;p&gt;The studioId. &lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder studioId(String studioId) {
            return studioId(Output.of(studioId));
        }

        public GetStudioComponentArgs build() {
            $.studioComponentId = Objects.requireNonNull($.studioComponentId, "expected parameter 'studioComponentId' to be non-null");
            $.studioId = Objects.requireNonNull($.studioId, "expected parameter 'studioId' to be non-null");
            return $;
        }
    }

}
