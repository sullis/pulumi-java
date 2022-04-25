// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Goo package repository. These are added to a repo file that is managed at `C:/ProgramData/GooGet/repos/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceGooRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceGooRepositoryArgs Empty = new OSPolicyResourceRepositoryResourceGooRepositoryArgs();

    /**
     * The name of the repository.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the repository.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The url of the repository.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The url of the repository.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private OSPolicyResourceRepositoryResourceGooRepositoryArgs() {}

    private OSPolicyResourceRepositoryResourceGooRepositoryArgs(OSPolicyResourceRepositoryResourceGooRepositoryArgs $) {
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceRepositoryResourceGooRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceGooRepositoryArgs $;

        public Builder() {
            $ = new OSPolicyResourceRepositoryResourceGooRepositoryArgs();
        }

        public Builder(OSPolicyResourceRepositoryResourceGooRepositoryArgs defaults) {
            $ = new OSPolicyResourceRepositoryResourceGooRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the repository.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param url The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The url of the repository.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public OSPolicyResourceRepositoryResourceGooRepositoryArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
