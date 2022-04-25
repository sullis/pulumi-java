// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information on the backed up item.
 * 
 */
public final class MabFileFolderProtectedItemExtendedInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MabFileFolderProtectedItemExtendedInfoArgs Empty = new MabFileFolderProtectedItemExtendedInfoArgs();

    /**
     * Last time when the agent data synced to service.
     * 
     */
    @Import(name="lastRefreshedAt")
    private @Nullable Output<String> lastRefreshedAt;

    /**
     * @return Last time when the agent data synced to service.
     * 
     */
    public Optional<Output<String>> lastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }

    /**
     * The oldest backup copy available.
     * 
     */
    @Import(name="oldestRecoveryPoint")
    private @Nullable Output<String> oldestRecoveryPoint;

    /**
     * @return The oldest backup copy available.
     * 
     */
    public Optional<Output<String>> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Number of backup copies associated with the backup item.
     * 
     */
    @Import(name="recoveryPointCount")
    private @Nullable Output<Integer> recoveryPointCount;

    /**
     * @return Number of backup copies associated with the backup item.
     * 
     */
    public Optional<Output<Integer>> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    private MabFileFolderProtectedItemExtendedInfoArgs() {}

    private MabFileFolderProtectedItemExtendedInfoArgs(MabFileFolderProtectedItemExtendedInfoArgs $) {
        this.lastRefreshedAt = $.lastRefreshedAt;
        this.oldestRecoveryPoint = $.oldestRecoveryPoint;
        this.recoveryPointCount = $.recoveryPointCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MabFileFolderProtectedItemExtendedInfoArgs $;

        public Builder() {
            $ = new MabFileFolderProtectedItemExtendedInfoArgs();
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
            $ = new MabFileFolderProtectedItemExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastRefreshedAt Last time when the agent data synced to service.
         * 
         * @return builder
         * 
         */
        public Builder lastRefreshedAt(@Nullable Output<String> lastRefreshedAt) {
            $.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        /**
         * @param lastRefreshedAt Last time when the agent data synced to service.
         * 
         * @return builder
         * 
         */
        public Builder lastRefreshedAt(String lastRefreshedAt) {
            return lastRefreshedAt(Output.of(lastRefreshedAt));
        }

        /**
         * @param oldestRecoveryPoint The oldest backup copy available.
         * 
         * @return builder
         * 
         */
        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            $.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        /**
         * @param oldestRecoveryPoint The oldest backup copy available.
         * 
         * @return builder
         * 
         */
        public Builder oldestRecoveryPoint(String oldestRecoveryPoint) {
            return oldestRecoveryPoint(Output.of(oldestRecoveryPoint));
        }

        /**
         * @param recoveryPointCount Number of backup copies associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            $.recoveryPointCount = recoveryPointCount;
            return this;
        }

        /**
         * @param recoveryPointCount Number of backup copies associated with the backup item.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointCount(Integer recoveryPointCount) {
            return recoveryPointCount(Output.of(recoveryPointCount));
        }

        public MabFileFolderProtectedItemExtendedInfoArgs build() {
            return $;
        }
    }

}
