// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A file or directory to install on the device before the test starts.
 * 
 */
public final class IosDeviceFileResponse extends io.pulumi.resources.InvokeArgs {

    public static final IosDeviceFileResponse Empty = new IosDeviceFileResponse();

    /**
     * The bundle id of the app where this file lives. iOS apps sandbox their own filesystem, so app files must specify which app installed on the device.
     * 
     */
    @InputImport(name="bundleId", required=true)
      private final String bundleId;

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * The source file
     * 
     */
    @InputImport(name="content", required=true)
      private final FileReferenceResponse content;

    public FileReferenceResponse getContent() {
        return this.content;
    }

    /**
     * Location of the file on the device, inside the app's sandboxed filesystem
     * 
     */
    @InputImport(name="devicePath", required=true)
      private final String devicePath;

    public String getDevicePath() {
        return this.devicePath;
    }

    public IosDeviceFileResponse(
        String bundleId,
        FileReferenceResponse content,
        String devicePath) {
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.devicePath = Objects.requireNonNull(devicePath, "expected parameter 'devicePath' to be non-null");
    }

    private IosDeviceFileResponse() {
        this.bundleId = null;
        this.content = null;
        this.devicePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosDeviceFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bundleId;
        private FileReferenceResponse content;
        private String devicePath;

        public Builder() {
    	      // Empty
        }

        public Builder(IosDeviceFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.content = defaults.content;
    	      this.devicePath = defaults.devicePath;
        }

        public Builder setBundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }

        public Builder setContent(FileReferenceResponse content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setDevicePath(String devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }
        public IosDeviceFileResponse build() {
            return new IosDeviceFileResponse(bundleId, content, devicePath);
        }
    }
}