// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceSpecificLoggingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceSpecificLoggingPlainArgs Empty = new GetResourceSpecificLoggingPlainArgs();

    /**
     * Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    @Import(name="targetId", required=true)
    private String targetId;

    /**
     * @return Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
     * 
     */
    public String targetId() {
        return this.targetId;
    }

    private GetResourceSpecificLoggingPlainArgs() {}

    private GetResourceSpecificLoggingPlainArgs(GetResourceSpecificLoggingPlainArgs $) {
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceSpecificLoggingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceSpecificLoggingPlainArgs $;

        public Builder() {
            $ = new GetResourceSpecificLoggingPlainArgs();
        }

        public Builder(GetResourceSpecificLoggingPlainArgs defaults) {
            $ = new GetResourceSpecificLoggingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetId Unique Id for a Target (TargetType:TargetName), this will be internally built to serve as primary identifier for a log target.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            $.targetId = targetId;
            return this;
        }

        public GetResourceSpecificLoggingPlainArgs build() {
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            return $;
        }
    }

}
