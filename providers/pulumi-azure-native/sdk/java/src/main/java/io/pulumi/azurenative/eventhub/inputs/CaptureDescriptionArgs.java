// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.azurenative.eventhub.enums.EncodingCaptureDescription;
import io.pulumi.azurenative.eventhub.inputs.DestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties to configure capture description for eventhub
 * 
 */
public final class CaptureDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaptureDescriptionArgs Empty = new CaptureDescriptionArgs();

    /**
     * Properties of Destination where capture will be stored. (Storage Account, Blob Names)
     * 
     */
    @InputImport(name="destination")
    private final @Nullable Input<DestinationArgs> destination;

    public Input<DestinationArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * A value that indicates whether capture description is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Enumerates the possible values for the encoding format of capture description. Note: 'AvroDeflate' will be deprecated in New API Version
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<EncodingCaptureDescription> encoding;

    public Input<EncodingCaptureDescription> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The time window allows you to set the frequency with which the capture to Azure Blobs will happen, value should between 60 to 900 seconds
     * 
     */
    @InputImport(name="intervalInSeconds")
    private final @Nullable Input<Integer> intervalInSeconds;

    public Input<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Input.empty() : this.intervalInSeconds;
    }

    /**
     * The size window defines the amount of data built up in your Event Hub before an capture operation, value should be between 10485760 to 524288000 bytes
     * 
     */
    @InputImport(name="sizeLimitInBytes")
    private final @Nullable Input<Integer> sizeLimitInBytes;

    public Input<Integer> getSizeLimitInBytes() {
        return this.sizeLimitInBytes == null ? Input.empty() : this.sizeLimitInBytes;
    }

    /**
     * A value that indicates whether to Skip Empty Archives
     * 
     */
    @InputImport(name="skipEmptyArchives")
    private final @Nullable Input<Boolean> skipEmptyArchives;

    public Input<Boolean> getSkipEmptyArchives() {
        return this.skipEmptyArchives == null ? Input.empty() : this.skipEmptyArchives;
    }

    public CaptureDescriptionArgs(
        @Nullable Input<DestinationArgs> destination,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<EncodingCaptureDescription> encoding,
        @Nullable Input<Integer> intervalInSeconds,
        @Nullable Input<Integer> sizeLimitInBytes,
        @Nullable Input<Boolean> skipEmptyArchives) {
        this.destination = destination;
        this.enabled = enabled;
        this.encoding = encoding;
        this.intervalInSeconds = intervalInSeconds;
        this.sizeLimitInBytes = sizeLimitInBytes;
        this.skipEmptyArchives = skipEmptyArchives;
    }

    private CaptureDescriptionArgs() {
        this.destination = Input.empty();
        this.enabled = Input.empty();
        this.encoding = Input.empty();
        this.intervalInSeconds = Input.empty();
        this.sizeLimitInBytes = Input.empty();
        this.skipEmptyArchives = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaptureDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DestinationArgs> destination;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<EncodingCaptureDescription> encoding;
        private @Nullable Input<Integer> intervalInSeconds;
        private @Nullable Input<Integer> sizeLimitInBytes;
        private @Nullable Input<Boolean> skipEmptyArchives;

        public Builder() {
    	      // Empty
        }

        public Builder(CaptureDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
    	      this.encoding = defaults.encoding;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeLimitInBytes = defaults.sizeLimitInBytes;
    	      this.skipEmptyArchives = defaults.skipEmptyArchives;
        }

        public Builder setDestination(@Nullable Input<DestinationArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDestination(@Nullable DestinationArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEncoding(@Nullable Input<EncodingCaptureDescription> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable EncodingCaptureDescription encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Input<Integer> intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = Input.ofNullable(intervalInSeconds);
            return this;
        }

        public Builder setSizeLimitInBytes(@Nullable Input<Integer> sizeLimitInBytes) {
            this.sizeLimitInBytes = sizeLimitInBytes;
            return this;
        }

        public Builder setSizeLimitInBytes(@Nullable Integer sizeLimitInBytes) {
            this.sizeLimitInBytes = Input.ofNullable(sizeLimitInBytes);
            return this;
        }

        public Builder setSkipEmptyArchives(@Nullable Input<Boolean> skipEmptyArchives) {
            this.skipEmptyArchives = skipEmptyArchives;
            return this;
        }

        public Builder setSkipEmptyArchives(@Nullable Boolean skipEmptyArchives) {
            this.skipEmptyArchives = Input.ofNullable(skipEmptyArchives);
            return this;
        }

        public CaptureDescriptionArgs build() {
            return new CaptureDescriptionArgs(destination, enabled, encoding, intervalInSeconds, sizeLimitInBytes, skipEmptyArchives);
        }
    }
}
