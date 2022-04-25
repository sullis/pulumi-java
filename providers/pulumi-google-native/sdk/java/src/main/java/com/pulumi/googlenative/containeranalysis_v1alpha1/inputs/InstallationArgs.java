// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LocationArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This represents how a particular software package may be installed on a system.
 * 
 */
public final class InstallationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstallationArgs Empty = new InstallationArgs();

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    @Import(name="location")
    private @Nullable Output<List<LocationArgs>> location;

    /**
     * @return All of the places within the filesystem versions of this package have been found.
     * 
     */
    public Optional<Output<List<LocationArgs>>> location() {
        return Optional.ofNullable(this.location);
    }

    private InstallationArgs() {}

    private InstallationArgs(InstallationArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstallationArgs $;

        public Builder() {
            $ = new InstallationArgs();
        }

        public Builder(InstallationArgs defaults) {
            $ = new InstallationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<List<LocationArgs>> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(List<LocationArgs> location) {
            return location(Output.of(location));
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(LocationArgs... location) {
            return location(List.of(location));
        }

        public InstallationArgs build() {
            return $;
        }
    }

}
