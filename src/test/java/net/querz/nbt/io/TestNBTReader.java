package net.querz.nbt.io;

import net.querz.NBTTestCase;
import net.querz.io.seekable.SeekableByteArray;
import net.querz.io.seekable.SeekableFile;
import net.querz.mca.MCAFile;
import net.querz.mca.MCAFileHandle;
import net.querz.mca.MCCFileHandler;
import net.querz.nbt.IntTag;
import net.querz.nbt.ListTag;
import net.querz.nbt.io.stream.SelectionStreamTagVisitor;
import net.querz.nbt.io.stream.TagSelector;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestNBTReader extends NBTTestCase {

	@Test
	public void testRead() throws IOException {
//		TagSelector selector = new TagSelector("sections", ListTag.READER);
//		File file = new File("C:\\Users\\Raphael\\IdeaProjects\\NBT7\\src\\test\\resources\\net\\querz\\nbt\\io\\r.1.-2.mca");
//
////		MCAFile mcaFile = new MCAFile(file);
////		try (MCAFileHandle handle = new MCAFileHandle(
////				file.getParentFile(),
////				new SeekableFile(file, "r"),
////				MCCFileHandler.DEFAULT_HANDLER,
////				() -> new SelectionStreamTagVisitor(selector),
////				true
////		)) {
////			mcaFile.load(handle);
////		}
////		System.out.println(t);
////
////		t.reset();
//		int it = 20;
//		long min = Long.MAX_VALUE, max = 0, avg = 0;
//		for (int i = 0; i < it; i++) {
//			Timer t = new Timer();
//			MCAFile mcaFile = new MCAFile(file);
//			try (MCAFileHandle handle = new MCAFileHandle(
//					file.getParentFile(),
//					new SeekableFile(file, "r"),
//					MCCFileHandler.DEFAULT_HANDLER,
//					() -> new SelectionStreamTagVisitor(selector),
//					true
//			)) {
//				mcaFile.load(handle);
//			}
//			long dur = t.getNano();
//			if (dur < min) {
//				min = dur;
//			}
//			if (dur > max) {
//				max = dur;
//			}
//			avg += dur;
//			System.out.println(i + ": " + Timer.formatNano(dur));
//		}
//		avg /= it;
//		System.out.println("min: " + Timer.formatNano(min) + ", max: " + Timer.formatNano(max) + ", avg: " + Timer.formatNano(avg));
	}
}
