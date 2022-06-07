// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDefaultServiceAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultServiceAccountPlainArgs Empty = new GetDefaultServiceAccountPlainArgs();

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

    private GetDefaultServiceAccountPlainArgs() {}

    private GetDefaultServiceAccountPlainArgs(GetDefaultServiceAccountPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultServiceAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultServiceAccountPlainArgs $;

        public Builder() {
            $ = new GetDefaultServiceAccountPlainArgs();
        }

        public Builder(GetDefaultServiceAccountPlainArgs defaults) {
            $ = new GetDefaultServiceAccountPlainArgs(Objects.requireNonNull(defaults));
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

        public GetDefaultServiceAccountPlainArgs build() {
            return $;
        }
    }

}
