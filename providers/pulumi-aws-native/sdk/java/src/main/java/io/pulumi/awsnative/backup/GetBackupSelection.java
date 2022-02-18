// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.backup.inputs.GetBackupSelectionArgs;
import io.pulumi.awsnative.backup.outputs.GetBackupSelectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackupSelection {
/**
 * Resource Type definition for AWS::Backup::BackupSelection
 * 
 */
    public static CompletableFuture<GetBackupSelectionResult> invokeAsync(GetBackupSelectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:backup:getBackupSelection", TypeShape.of(GetBackupSelectionResult.class), args == null ? GetBackupSelectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
