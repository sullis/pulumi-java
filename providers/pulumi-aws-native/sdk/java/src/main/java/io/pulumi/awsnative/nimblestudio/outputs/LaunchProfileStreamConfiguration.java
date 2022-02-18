// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingClipboardMode;
import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingInstanceType;
import io.pulumi.awsnative.nimblestudio.outputs.LaunchProfileStreamConfigurationSessionStorage;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LaunchProfileStreamConfiguration {
    private final LaunchProfileStreamingClipboardMode clipboardMode;
    /**
     * <p>The EC2 instance types that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    private final List<LaunchProfileStreamingInstanceType> ec2InstanceTypes;
    /**
     * <p>The length of time, in minutes, that a streaming session can be active before it is
     *             stopped or terminated. After this point, Nimble Studio automatically terminates or
     *             stops the session. The default length of time is 690 minutes, and the maximum length of
     *             time is 30 days.</p>
     * 
     */
    private final @Nullable Double maxSessionLengthInMinutes;
    /**
     * <p>Integer that determines if you can start and stop your sessions and how long a session
     *             can stay in the STOPPED state. The default value is 0. The maximum value is 5760.</p>
     *         <p>If the value is missing or set to 0, your sessions can’t be stopped. If you then call
     *             StopStreamingSession, the session fails. If the time that a session stays in the READY
     *             state exceeds the maxSessionLengthInMinutes value, the session will automatically be
     *             terminated by AWS (instead of stopped).</p>
     *         <p>If the value is set to a positive number, the session can be stopped. You can call
     *             StopStreamingSession to stop sessions in the READY state. If the time that a session
     *             stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will
     *             automatically be stopped by AWS (instead of terminated).</p>
     * 
     */
    private final @Nullable Double maxStoppedSessionLengthInMinutes;
    private final @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage;
    /**
     * <p>The streaming images that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    private final List<String> streamingImageIds;

    @OutputCustomType.Constructor({"clipboardMode","ec2InstanceTypes","maxSessionLengthInMinutes","maxStoppedSessionLengthInMinutes","sessionStorage","streamingImageIds"})
    private LaunchProfileStreamConfiguration(
        LaunchProfileStreamingClipboardMode clipboardMode,
        List<LaunchProfileStreamingInstanceType> ec2InstanceTypes,
        @Nullable Double maxSessionLengthInMinutes,
        @Nullable Double maxStoppedSessionLengthInMinutes,
        @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage,
        List<String> streamingImageIds) {
        this.clipboardMode = Objects.requireNonNull(clipboardMode);
        this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes);
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
        this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
        this.sessionStorage = sessionStorage;
        this.streamingImageIds = Objects.requireNonNull(streamingImageIds);
    }

    public LaunchProfileStreamingClipboardMode getClipboardMode() {
        return this.clipboardMode;
    }
    /**
     * <p>The EC2 instance types that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    public List<LaunchProfileStreamingInstanceType> getEc2InstanceTypes() {
        return this.ec2InstanceTypes;
    }
    /**
     * <p>The length of time, in minutes, that a streaming session can be active before it is
     *             stopped or terminated. After this point, Nimble Studio automatically terminates or
     *             stops the session. The default length of time is 690 minutes, and the maximum length of
     *             time is 30 days.</p>
     * 
     */
    public Optional<Double> getMaxSessionLengthInMinutes() {
        return Optional.ofNullable(this.maxSessionLengthInMinutes);
    }
    /**
     * <p>Integer that determines if you can start and stop your sessions and how long a session
     *             can stay in the STOPPED state. The default value is 0. The maximum value is 5760.</p>
     *         <p>If the value is missing or set to 0, your sessions can’t be stopped. If you then call
     *             StopStreamingSession, the session fails. If the time that a session stays in the READY
     *             state exceeds the maxSessionLengthInMinutes value, the session will automatically be
     *             terminated by AWS (instead of stopped).</p>
     *         <p>If the value is set to a positive number, the session can be stopped. You can call
     *             StopStreamingSession to stop sessions in the READY state. If the time that a session
     *             stays in the READY state exceeds the maxSessionLengthInMinutes value, the session will
     *             automatically be stopped by AWS (instead of terminated).</p>
     * 
     */
    public Optional<Double> getMaxStoppedSessionLengthInMinutes() {
        return Optional.ofNullable(this.maxStoppedSessionLengthInMinutes);
    }
    public Optional<LaunchProfileStreamConfigurationSessionStorage> getSessionStorage() {
        return Optional.ofNullable(this.sessionStorage);
    }
    /**
     * <p>The streaming images that users can select from when launching a streaming session
     *             with this launch profile.</p>
     * 
     */
    public List<String> getStreamingImageIds() {
        return this.streamingImageIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchProfileStreamingClipboardMode clipboardMode;
        private List<LaunchProfileStreamingInstanceType> ec2InstanceTypes;
        private @Nullable Double maxSessionLengthInMinutes;
        private @Nullable Double maxStoppedSessionLengthInMinutes;
        private @Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage;
        private List<String> streamingImageIds;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clipboardMode = defaults.clipboardMode;
    	      this.ec2InstanceTypes = defaults.ec2InstanceTypes;
    	      this.maxSessionLengthInMinutes = defaults.maxSessionLengthInMinutes;
    	      this.maxStoppedSessionLengthInMinutes = defaults.maxStoppedSessionLengthInMinutes;
    	      this.sessionStorage = defaults.sessionStorage;
    	      this.streamingImageIds = defaults.streamingImageIds;
        }

        public Builder setClipboardMode(LaunchProfileStreamingClipboardMode clipboardMode) {
            this.clipboardMode = Objects.requireNonNull(clipboardMode);
            return this;
        }

        public Builder setEc2InstanceTypes(List<LaunchProfileStreamingInstanceType> ec2InstanceTypes) {
            this.ec2InstanceTypes = Objects.requireNonNull(ec2InstanceTypes);
            return this;
        }

        public Builder setMaxSessionLengthInMinutes(@Nullable Double maxSessionLengthInMinutes) {
            this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
            return this;
        }

        public Builder setMaxStoppedSessionLengthInMinutes(@Nullable Double maxStoppedSessionLengthInMinutes) {
            this.maxStoppedSessionLengthInMinutes = maxStoppedSessionLengthInMinutes;
            return this;
        }

        public Builder setSessionStorage(@Nullable LaunchProfileStreamConfigurationSessionStorage sessionStorage) {
            this.sessionStorage = sessionStorage;
            return this;
        }

        public Builder setStreamingImageIds(List<String> streamingImageIds) {
            this.streamingImageIds = Objects.requireNonNull(streamingImageIds);
            return this;
        }

        public LaunchProfileStreamConfiguration build() {
            return new LaunchProfileStreamConfiguration(clipboardMode, ec2InstanceTypes, maxSessionLengthInMinutes, maxStoppedSessionLengthInMinutes, sessionStorage, streamingImageIds);
        }
    }
}
