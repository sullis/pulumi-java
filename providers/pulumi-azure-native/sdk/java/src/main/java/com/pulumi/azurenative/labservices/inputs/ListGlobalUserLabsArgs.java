// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListGlobalUserLabsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListGlobalUserLabsArgs Empty = new ListGlobalUserLabsArgs();

    /**
     * The name of the user.
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return The name of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }

    private ListGlobalUserLabsArgs() {}

    private ListGlobalUserLabsArgs(ListGlobalUserLabsArgs $) {
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListGlobalUserLabsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListGlobalUserLabsArgs $;

        public Builder() {
            $ = new ListGlobalUserLabsArgs();
        }

        public Builder(ListGlobalUserLabsArgs defaults) {
            $ = new ListGlobalUserLabsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userName The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public ListGlobalUserLabsArgs build() {
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
