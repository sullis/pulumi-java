// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDefaultServiceAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultServiceAccountArgs Empty = new GetDefaultServiceAccountArgs();

    /**
     * The project ID. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project ID. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDefaultServiceAccountArgs() {}

    private GetDefaultServiceAccountArgs(GetDefaultServiceAccountArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultServiceAccountArgs $;

        public Builder() {
            $ = new GetDefaultServiceAccountArgs();
        }

        public Builder(GetDefaultServiceAccountArgs defaults) {
            $ = new GetDefaultServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project ID. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDefaultServiceAccountArgs build() {
            return $;
        }
    }

}
