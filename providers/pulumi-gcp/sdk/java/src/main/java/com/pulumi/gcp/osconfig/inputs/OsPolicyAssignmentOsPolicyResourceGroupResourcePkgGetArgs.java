// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumGetArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptGetArgs> apt;

    /**
     * @return An Apt Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptGetArgs>> apt() {
        return Optional.ofNullable(this.apt);
    }

    /**
     * A deb package file.
     * 
     */
    @Import(name="deb")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs> deb;

    /**
     * @return A deb package file.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs>> deb() {
        return Optional.ofNullable(this.deb);
    }

    /**
     * Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
     * 
     */
    @Import(name="desiredState", required=true)
    private Output<String> desiredState;

    /**
     * @return Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
     * 
     */
    public Output<String> desiredState() {
        return this.desiredState;
    }

    /**
     * A package managed by GooGet.
     * 
     */
    @Import(name="googet")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs> googet;

    /**
     * @return A package managed by GooGet.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs>> googet() {
        return Optional.ofNullable(this.googet);
    }

    /**
     * An MSI package.
     * 
     */
    @Import(name="msi")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiGetArgs> msi;

    /**
     * @return An MSI package.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiGetArgs>> msi() {
        return Optional.ofNullable(this.msi);
    }

    /**
     * An rpm package file.
     * 
     */
    @Import(name="rpm")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs> rpm;

    /**
     * @return An rpm package file.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs>> rpm() {
        return Optional.ofNullable(this.rpm);
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumGetArgs> yum;

    /**
     * @return A Yum Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumGetArgs>> yum() {
        return Optional.ofNullable(this.yum);
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperGetArgs> zypper;

    /**
     * @return A Zypper Repository.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperGetArgs>> zypper() {
        return Optional.ofNullable(this.zypper);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs $) {
        this.apt = $.apt;
        this.deb = $.deb;
        this.desiredState = $.desiredState;
        this.googet = $.googet;
        this.msi = $.msi;
        this.rpm = $.rpm;
        this.yum = $.yum;
        this.zypper = $.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apt An Apt Repository.
         * 
         * @return builder
         * 
         */
        public Builder apt(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptGetArgs> apt) {
            $.apt = apt;
            return this;
        }

        /**
         * @param apt An Apt Repository.
         * 
         * @return builder
         * 
         */
        public Builder apt(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgAptGetArgs apt) {
            return apt(Output.of(apt));
        }

        /**
         * @param deb A deb package file.
         * 
         * @return builder
         * 
         */
        public Builder deb(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs> deb) {
            $.deb = deb;
            return this;
        }

        /**
         * @param deb A deb package file.
         * 
         * @return builder
         * 
         */
        public Builder deb(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs deb) {
            return deb(Output.of(deb));
        }

        /**
         * @param desiredState Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
         * 
         * @return builder
         * 
         */
        public Builder desiredState(Output<String> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        /**
         * @param desiredState Required. The desired state the agent should maintain for this package. Possible values: DESIRED_STATE_UNSPECIFIED, INSTALLED, REMOVED
         * 
         * @return builder
         * 
         */
        public Builder desiredState(String desiredState) {
            return desiredState(Output.of(desiredState));
        }

        /**
         * @param googet A package managed by GooGet.
         * 
         * @return builder
         * 
         */
        public Builder googet(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs> googet) {
            $.googet = googet;
            return this;
        }

        /**
         * @param googet A package managed by GooGet.
         * 
         * @return builder
         * 
         */
        public Builder googet(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGoogetGetArgs googet) {
            return googet(Output.of(googet));
        }

        /**
         * @param msi An MSI package.
         * 
         * @return builder
         * 
         */
        public Builder msi(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiGetArgs> msi) {
            $.msi = msi;
            return this;
        }

        /**
         * @param msi An MSI package.
         * 
         * @return builder
         * 
         */
        public Builder msi(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiGetArgs msi) {
            return msi(Output.of(msi));
        }

        /**
         * @param rpm An rpm package file.
         * 
         * @return builder
         * 
         */
        public Builder rpm(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs> rpm) {
            $.rpm = rpm;
            return this;
        }

        /**
         * @param rpm An rpm package file.
         * 
         * @return builder
         * 
         */
        public Builder rpm(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmGetArgs rpm) {
            return rpm(Output.of(rpm));
        }

        /**
         * @param yum A Yum Repository.
         * 
         * @return builder
         * 
         */
        public Builder yum(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumGetArgs> yum) {
            $.yum = yum;
            return this;
        }

        /**
         * @param yum A Yum Repository.
         * 
         * @return builder
         * 
         */
        public Builder yum(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgYumGetArgs yum) {
            return yum(Output.of(yum));
        }

        /**
         * @param zypper A Zypper Repository.
         * 
         * @return builder
         * 
         */
        public Builder zypper(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperGetArgs> zypper) {
            $.zypper = zypper;
            return this;
        }

        /**
         * @param zypper A Zypper Repository.
         * 
         * @return builder
         * 
         */
        public Builder zypper(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgZypperGetArgs zypper) {
            return zypper(Output.of(zypper));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs build() {
            $.desiredState = Objects.requireNonNull($.desiredState, "expected parameter 'desiredState' to be non-null");
            return $;
        }
    }

}
