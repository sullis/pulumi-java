// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RGitHubPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final RGitHubPackageArgs Empty = new RGitHubPackageArgs();

    /**
     * Personal access token to install from a private repo
     * 
     */
    @Import(name="authToken")
    private @Nullable Output<String> authToken;

    /**
     * @return Personal access token to install from a private repo
     * 
     */
    public Optional<Output<String>> authToken() {
        return Optional.ofNullable(this.authToken);
    }

    /**
     * Repository address in the format username/repo[/subdir][@ref|#pull].
     * 
     */
    @Import(name="repository")
    private @Nullable Output<String> repository;

    /**
     * @return Repository address in the format username/repo[/subdir][@ref|#pull].
     * 
     */
    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    private RGitHubPackageArgs() {}

    private RGitHubPackageArgs(RGitHubPackageArgs $) {
        this.authToken = $.authToken;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RGitHubPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RGitHubPackageArgs $;

        public Builder() {
            $ = new RGitHubPackageArgs();
        }

        public Builder(RGitHubPackageArgs defaults) {
            $ = new RGitHubPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authToken Personal access token to install from a private repo
         * 
         * @return builder
         * 
         */
        public Builder authToken(@Nullable Output<String> authToken) {
            $.authToken = authToken;
            return this;
        }

        /**
         * @param authToken Personal access token to install from a private repo
         * 
         * @return builder
         * 
         */
        public Builder authToken(String authToken) {
            return authToken(Output.of(authToken));
        }

        /**
         * @param repository Repository address in the format username/repo[/subdir][@ref|#pull].
         * 
         * @return builder
         * 
         */
        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Repository address in the format username/repo[/subdir][@ref|#pull].
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public RGitHubPackageArgs build() {
            return $;
        }
    }

}
