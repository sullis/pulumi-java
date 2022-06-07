// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetPlainArgs Empty = new GetAssetPlainArgs();

    /**
     * The unique identifier for the Asset.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique identifier for the Asset.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAssetPlainArgs() {}

    private GetAssetPlainArgs(GetAssetPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetPlainArgs $;

        public Builder() {
            $ = new GetAssetPlainArgs();
        }

        public Builder(GetAssetPlainArgs defaults) {
            $ = new GetAssetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique identifier for the Asset.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAssetPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
