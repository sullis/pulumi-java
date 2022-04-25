// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * An RPM package file. RPM packages only support INSTALLED state.
 * 
 */
public final class OSPolicyResourcePackageResourceRPMResponse extends com.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceRPMResponse Empty = new OSPolicyResourcePackageResourceRPMResponse();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @Import(name="pullDeps", required=true)
    private Boolean pullDeps;

    /**
     * @return Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    public Boolean pullDeps() {
        return this.pullDeps;
    }

    /**
     * An rpm package.
     * 
     */
    @Import(name="source", required=true)
    private OSPolicyResourceFileResponse source;

    /**
     * @return An rpm package.
     * 
     */
    public OSPolicyResourceFileResponse source() {
        return this.source;
    }

    private OSPolicyResourcePackageResourceRPMResponse() {}

    private OSPolicyResourcePackageResourceRPMResponse(OSPolicyResourcePackageResourceRPMResponse $) {
        this.pullDeps = $.pullDeps;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourcePackageResourceRPMResponse $;

        public Builder() {
            $ = new OSPolicyResourcePackageResourceRPMResponse();
        }

        public Builder(OSPolicyResourcePackageResourceRPMResponse defaults) {
            $ = new OSPolicyResourcePackageResourceRPMResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param pullDeps Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
         * 
         * @return builder
         * 
         */
        public Builder pullDeps(Boolean pullDeps) {
            $.pullDeps = pullDeps;
            return this;
        }

        /**
         * @param source An rpm package.
         * 
         * @return builder
         * 
         */
        public Builder source(OSPolicyResourceFileResponse source) {
            $.source = source;
            return this;
        }

        public OSPolicyResourcePackageResourceRPMResponse build() {
            $.pullDeps = Objects.requireNonNull($.pullDeps, "expected parameter 'pullDeps' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
